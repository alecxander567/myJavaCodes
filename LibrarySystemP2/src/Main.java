import java.util.Scanner;
import java.util.Arrays;
public class Main {
	
	static void sortBooksByNameOne(Books[] myBooks) {
		int n = myBooks.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(myBooks[j].bookName.compareTo(myBooks[j + 1].bookName) > 0) {
					String temp1 = myBooks[j].bookName;
					int temp2 = myBooks[j].bookNum;
					
					myBooks[j].bookName = myBooks[j + 1].bookName;
					myBooks[j + 1].bookName = temp1;
					myBooks[j].bookNum = myBooks[j + 1].bookNum;
					myBooks[j + 1].bookNum = temp2;
				}
			}
		}
	}
	
	static void sortBooksByNameTwo(Books[] myBooks) {
		int n = myBooks.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(myBooks[j + 1].bookName.compareTo(myBooks[j].bookName) > 0) {
					String temp1 = myBooks[j].bookName;
					int temp2 = myBooks[j].bookNum;
					
					myBooks[j].bookName = myBooks[j + 1].bookName;
					myBooks[j + 1].bookName = temp1;
					myBooks[j].bookNum = myBooks[j + 1].bookNum;
					myBooks[j + 1].bookNum = temp2;
				}
			}
		}
	}
	
	static void sortByBookNumberOne(Books[] myBooks) {
		int n = myBooks.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(myBooks[j].bookNum > myBooks[j + 1].bookNum) {
					int temp1 = myBooks[j].bookNum;
					String temp2 = myBooks[j].bookName;
													
					myBooks[j].bookNum = myBooks[j + 1].bookNum;
					myBooks[j + 1].bookNum = temp1;
					myBooks[j].bookName = myBooks[j + 1].bookName;
					myBooks[j + 1].bookName = temp2;
				}
			}
		}
	}
	
	static void sortByBookNumberTwo(Books[] myBooks) {
		int n = myBooks.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(myBooks[j + 1].bookNum > myBooks[j].bookNum) {
					int temp1 = myBooks[j].bookNum;
					String temp2 = myBooks[j].bookName;
													
					myBooks[j].bookNum = myBooks[j + 1].bookNum;
					myBooks[j + 1].bookNum = temp1;
					myBooks[j].bookName = myBooks[j + 1].bookName;
					myBooks[j + 1].bookName = temp2;
				}
			}
		}
	}
	
	
	static void searchBooks(Books[] myBooks) {
		int n = myBooks[0].bookNum;
		Scanner s = new Scanner(System.in);
		int num;
		boolean found = false;
		
		System.out.print("\nEnter the book number to search : ");
		num = s.nextInt();
		
		for(int i = 0; i < myBooks.length; i++) {
			if(num == myBooks[i].bookNum) {
				System.out.println("\nBook found : ");
				myBooks[i].displayBooks();
				found = true;
			}
		}
		
		if(found == false) {
			System.out.println("\nBook not found!");
		}
	}
	
	static Books[] removedBooks(Books[] myBooks, int booknum) {
		int index = - 1;
		for(int i = 0; i < myBooks.length; i++) {
			if(myBooks[i].bookNum == booknum) {
				index = i;
				break;
			}
		}
		
		if(index == - 1) {
			System.out.println("\nBook not found!");
			return myBooks;
		}
		
		Books[] removed = new Books[myBooks.length - 1];
		for(int i = 0, j = 0; i < myBooks.length; i++) {
			if(i != index) {
				removed[j++] = myBooks[i];
			}
		}
		
		System.out.println("\nBook removed successfully!");
		return removed;
	}
			    
    static int preview() {
    	Scanner s = new Scanner(System.in);
    	int choice;
    	
    	System.out.println("\nEnter your choice from the menu : ");
    	System.out.println("[1] Display Books");
    	System.out.println("[2] Add Books");
    	System.out.println("[3] Search Books");
    	System.out.println("[4] Sort Books by name (Ascending)");
    	System.out.println("[5] Sort Books by name (Descending)");
    	System.out.println("[6] Sort Books by book number (Ascending)");
    	System.out.println("[7] Sort Books by number (Descending)");
    	System.out.println("[8] Remove Books");
    	System.out.println("[0] Exit the program");
    	
    	System.out.print("\nEnter your choice : ");
    	choice = s.nextInt();
    	
    	return choice;
    }
    
    static void message() {
    	System.out.println("LIBRARY SYSTEM PART 2");
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	     Books[] myBooks = new Books[5];
	     int option;
	     
	     message();
	     
	     for(int i = 0; i < myBooks.length; i++) {
	    	 myBooks[i] = new Books("", 0);
	     }
	     
	     myBooks[0].bookName = "Java Tutorial";
	     myBooks[0].bookNum = 5;
	     myBooks[1].bookName = "Software Engineering book";
	     myBooks[1].bookNum = 2;
	     myBooks[2].bookName = "Python for beginners";
	     myBooks[2].bookNum = 3;
	     myBooks[3].bookName = "C++ Tutorial";
	     myBooks[3].bookNum = 4;
	     myBooks[4].bookName = "C# getting started";
	     myBooks[4].bookNum = 1;
	     
	     do {
	    	 
	    	 option = preview();
	    	 
	    	 switch(option) {
	    	 case 1:
	    		 System.out.println("\nLIST OF BOOKS : ");
	    		 for(int i = 0; i < myBooks.length; i++) {
	    			 myBooks[i].displayBooks();
	    		 }
	    		 break;
	    	 case 2:
	    		 int num;
	    			
	    			System.out.print("\nEnter how many books you want to add : ");
	    			num = s.nextInt();
	    			
	    			Books[] newBooks = new Books[myBooks.length + num];
	    			
	    			for(int i = 0; i < myBooks.length; i++) {
	    				newBooks[i] = myBooks[i];
	    			}
	    			
	    			for(int i = myBooks.length; i < newBooks.length; i++) {
	    				s.nextLine();
	    				System.out.print("\nEnter the name of the book : ");
	    				String name = s.nextLine();
	    				System.out.print("Enter the book number : ");
	    				int number = s.nextInt();
	    				
	    				newBooks[i] = new Books(name, number);
	    			}
	    			
	    			myBooks = newBooks;
	    		 break;    		 
	    	 case 3: 
	    		 searchBooks(myBooks);
	    		 break;
	    	 case 4:
	    		 sortBooksByNameOne(myBooks);
	    		 break;
	    	 case 5:
	    		 sortBooksByNameTwo(myBooks);
	    		 break;
	    	 case 6: 
	    		 sortByBookNumberOne(myBooks);
	    		 break;
	    	 case 7:
	    		 sortByBookNumberTwo(myBooks);
	    		 break;
	    	 case 8:
	    		 System.out.print("\nEnter the book to remove :");
	    		 int booknum = s.nextInt();
	    		 myBooks = removedBooks(myBooks, booknum);
	    		 break;
	    	 case 0:
	    		 System.out.println("\nThank you!");
	    		 break;
	    	default:
	    		System.out.println("\nInvalid! please enter 0 to exit");
	    		break;
	    	 }
	    	 
	     } while(option != 0);
	}

}
