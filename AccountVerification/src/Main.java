import java.util.Scanner;
import java.util.Arrays;
public class Main {
	
	static Account[] removeAccount(Account[] myAccount, String removedEmail, int removedPasscode) {
		int index = -1;
		
		for(int i = 0; i < myAccount.length; i++) {
			if(myAccount[i].email.equals(removedEmail) && myAccount[i].passcode == removedPasscode) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("\nAccount to remove not found!");
			return myAccount;
		}
		
		Account[] newAccounts = new Account[myAccount.length - 1];
		for(int i = 0, j = 0; i < myAccount.length; i++) {
			if(i != index) {
				newAccounts[j++] = myAccount[i];
			}
		}
		
		System.out.println("\nAccount deleted successfully!");
		return newAccounts;
	}
	
	static void accountLogIn(Account[] myAccount) {
		Scanner s = new Scanner(System.in);
		String enterEmail;
		int index, enterPasscode;
		boolean found = false;
		
		index = 0;
		
		System.out.print("\nEnter your email : ");
		enterEmail = s.nextLine();
		System.out.print("Enter passcode : ");
		enterPasscode = s.nextInt();
		
		for(int i = 0; i < myAccount.length; i++) {
			if(myAccount[i].email.equals(enterEmail) && myAccount[i].passcode == enterPasscode) {
				System.out.println("\nYou have successfully logged in!");
				found = true;
			}
		}
		
		if(!found) {
			System.out.println("\nAccount doesn't exist! please check your email or password or create a new account.");
		}
	}
	
	static int preview() {
		Scanner s = new Scanner(System.in);
		int choice;
		
		System.out.println("\nSelect from the menu : ");
		System.out.println("[1] Log in an existing account");
		System.out.println("[2] Add a new account");
		System.out.println("[3] Delete account");
		System.out.println("[0] Exit");
		
		System.out.print("\nEnter your choice : ");
		choice = s.nextInt();
		
		return choice;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Account[] myAccount = new Account[5];
		String enterEmail;
		int enterPasscode, option;
		
		System.out.println("Account Verification System");
		
		for(int i = 0; i < myAccount.length; i++) {
			myAccount[i] = new Account("", 0);
		}
		
		myAccount[0].email = "Admin1";
		myAccount[0].passcode = 123;
		myAccount[1].email = "Admin2";
		myAccount[1].passcode = 567;
		myAccount[2].email = "Admin3";
		myAccount[2].passcode = 8910;
		myAccount[3].email = "Admin4";
		myAccount[3].passcode = 111213;
		myAccount[4].email = "Admin5";
		myAccount[4].passcode = 23;
		
		do {
			
			option = preview();
			
			switch(option) {
			case 1:
				accountLogIn(myAccount);
				break;
			case 2:
				int add;
				
				Account[] updatedAccounts = new Account[myAccount.length + 1];
				

				for(int i = 0; i < myAccount.length; i++) {
					updatedAccounts[i] = myAccount[i];
				}
				
				for(int i = myAccount.length; i < updatedAccounts.length; i++) {				
					System.out.print("\nEnter your email : ");
					String newEmail = s.nextLine();
					System.out.print("Enter your passcode : ");
					int newPasscode = s.nextInt();
					
					System.out.println("\nAccount created successfully!");
					
					updatedAccounts[i] = new Account(newEmail, newPasscode);
				}
				
				myAccount = updatedAccounts;
				break;
			case 3: 
				int removedPasscode;
				String removedEmail;
				
				s.nextLine();
				System.out.print("\nEnter the email : ");
				removedEmail = s.nextLine();
				System.out.print("Enter the passcode : ");
				removedPasscode = s.nextInt();
							
				myAccount = removeAccount(myAccount, removedEmail, removedPasscode);
				break;
			case 0:
				System.out.println("\nGoodbye!");
				break;
			default:
				System.out.println("\nInvalid input key!");
				break;
			}
			
		} while(option != 0);
	}

}
