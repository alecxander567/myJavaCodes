import java.util.Scanner;
public class Main {

	static int displayMenu() {
		Scanner s = new Scanner(System.in);
		int choice;
		
		System.out.println("\nEnter your choice");
		System.out.println("[1] Display Budget");
		System.out.println("[2] Get thousand");
		System.out.println("[3] Get Hundreds");
		System.out.println("[4] Get Tens");
		System.out.println("[0] Exit program");
		
		System.out.print("\nYour choice : ");
		choice = s.nextInt();
		
		return choice;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int option;
		
		System.out.println("Java Budgeting System");
				
		Budget[] thousands = new Budget[5];
		Budget[] hundreds = new Budget[5];
		Budget[] tens = new Budget[5];
				
		do {
			
			option = displayMenu();
			
			switch(option) {
			case 1: 
				System.out.println("\nThis is your budget : ");
				
				for(int i = 0; i < thousands.length; i++) {
				}
				System.out.println("₱1000 [" + thousands.length + "]");
				
				for(int i = 0; i < hundreds.length; i++) {
				}
				System.out.println("₱500 [" + hundreds.length + "]");
				
				for(int i = 0; i < tens.length; i++) {
				}
				System.out.println("₱50 [" + tens.length + "]");
				break;
			case 2:
				int removeAmount;
				
				System.out.print("\nEnter how many you want to cash out :");
				removeAmount = s.nextInt();
				
				if(removeAmount > thousands.length || removeAmount < 0) {
					System.out.println("\nInvalid amount to cash out!");
				} else {
					Budget[] newThousands = new Budget[thousands.length - removeAmount];
					
					for(int i = thousands.length; i < thousands.length; i++) {
						newThousands[i] = thousands[i];
					}
				
				   thousands = newThousands;
				}
				break;
			case 3:
				int removeAmount2;
				
				System.out.print("\nEnter how many you want to cash out : ");
				removeAmount2 = s.nextInt();
				
				if(removeAmount2 > hundreds.length || removeAmount2 < 0) {
					System.out.println("Invalid amount to cash out!");
				} else {
						
					Budget[] newHundreds = new Budget[hundreds.length - removeAmount2];
					
					for(int i = hundreds.length; i < hundreds.length; i++) {
						newHundreds[i] = hundreds[i];
					}
					
					hundreds = newHundreds;
				}
				break;
			case 4:
				int removeAmount3;
				
				System.out.println("\nEnter how many you want to cash out : ");
				removeAmount3 = s.nextInt();
				
				if(removeAmount3 > tens.length || removeAmount3 < 0) {
					System.out.println("Invalid amount you want to cash out!");
				} else {
					Budget[] newTens = new Budget[tens.length - removeAmount3];
					
					for(int i = tens.length; i < tens.length; i++) {
						newTens[i] = tens[i];
					}
					
					tens = newTens;
				}
				break;
			case 0:
				System.out.println("\nThank you!");
				break;
			default:
				System.out.println("\nPlease enter 0 to exit!");
				break;
			}
			
		} while(option != 0);
	}

}
