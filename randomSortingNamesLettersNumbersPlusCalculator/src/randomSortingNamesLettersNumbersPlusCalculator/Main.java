package randomSortingNamesLettersNumbersPlusCalculator;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
	
	public static void message() {
		System.out.println("WELCOME TO MY SIMPLE JAVA PROGRAM!");
	}
	
	public static void sortNamesAZ(myClass[] myNames) {
		int n = myNames.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(myNames[j].names.compareTo(myNames[j + 1].names) > 0) {
					String temp = myNames[j].names;
					
					myNames[j].names = myNames[j + 1].names;
					myNames[j + 1].names = temp;					
				}
			}
		}
	}
	
	public static void sortNamesZA(myClass[] myNames) {
		int n = myNames.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(myNames[j + 1].names.compareTo(myNames[j].names) > 0) {
					String temp = myNames[j].names;
					
					myNames[j].names = myNames[j + 1].names;
					myNames[j + 1].names = temp;
				}
			}
		}
	}
	
	public static void sortNumbersAscending(myClass[] myNumbers) {
		int n = myNumbers.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(myNumbers[j].numbers > myNumbers[j + 1].numbers) {
					int temp = myNumbers[j].numbers;
					
					myNumbers[j].numbers = myNumbers[j + 1].numbers;
					myNumbers[j + 1].numbers = temp;
				}
			}
		}
	}
	
	public static void sortNumbersDescending(myClass[] myNumbers) {
		int n = myNumbers.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(myNumbers[j + 1].numbers > myNumbers[j].numbers) {
					int temp = myNumbers[j].numbers;
					
					myNumbers[j].numbers = myNumbers[j + 1].numbers;
					myNumbers[j + 1].numbers = temp;
				}
			}
		}
	}
	
	public static void sortLettersAZ(myClass[] myLetters) {
		int n = myLetters.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(myLetters[j].letters > myLetters[j + 1].letters) {
					char temp = myLetters[j].letters;
					
					myLetters[j].letters = myLetters[j + 1].letters;
					myLetters[j + 1].letters = temp;
				}
			}
		}
	}
	
	public static void sortLettersZA(myClass[] myLetters) {
		int n = myLetters.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(myLetters[j + 1].letters > myLetters[j].letters) {
					char temp = myLetters[j].letters;
					
					myLetters[j].letters = myLetters[j + 1].letters;
					myLetters[j + 1].letters = temp;
				}
			}
		}
	}
	
	public static void oddEven(myClass[] myNumbers) {
		int myTemp = myNumbers[0].numbers;
		
		for(int i = 0; i < myNumbers.length; i++) {
			if(myNumbers[i].numbers %2 == 0) {
				System.out.println("\nEven : " + myNumbers[i].numbers);
			} else if(myNumbers[i].numbers %2 != 0) {
				System.out.println("\nOdd : " + myNumbers[i].numbers);
			}
		}
	}
	
	public static void positiveNegative(myClass[] myNumbers) {
		int myTemp = myNumbers[0].numbers;
		
		for(int i = 0; i < myNumbers.length; i++) {
			if(myNumbers[i].numbers > 0) {
				System.out.println("\nPositive : " + myNumbers[i].numbers);
			} else if(myNumbers[i].numbers < 0) {
				System.out.println("\nNegative : " + myNumbers[i].numbers);
			} else if(myNumbers[i].numbers == 0) {
				System.out.println("\nOdd :" + myNumbers[i].numbers);
			}
		}
	}
	
	public static void lowestValue(myClass[] myNumbers) {
		int lowest, index;
		lowest = myNumbers[0].numbers;
		index = 0;
		
		for(int i = 0; i < myNumbers.length; i++) {
			if(myNumbers[i].numbers < lowest) {
				lowest = myNumbers[i].numbers;
				index = i;
			}
		}
		
		System.out.println("\nThe lowest value is : ");
		myNumbers[index].displayNumbers();
	}
	
	public static void highestValue(myClass[] myNumbers) {
		int highest, index;
		highest = myNumbers[0].numbers;
		index = 0;
		
		for(int i = 0; i < myNumbers.length; i++) {
			if(myNumbers[i].numbers > highest) {
				highest = myNumbers[i].numbers;
				index = i;
			}
		}
		
		System.out.println("\nThe highest value is : ");
		myNumbers[index].displayNumbers();
	}
	
	public static void myCalculator() {
		Scanner con = new Scanner(System.in);
		
		System.out.println("\nSelect an operator : ");
		System.out.println("[1] Addition");
		System.out.println("[2] Subtraction");
		System.out.println("[3] Multiplication");
		System.out.println("[4] Division");
		
		System.out.print("\nMy operator : ");
		int operator = con.nextInt();
		
		System.out.print("\nEnter how many values you want to operate : ");
		int values = con.nextInt();
		
		int[] myValuesOne = new int[values];
		
		System.out.println("\nEnter the first values : ");
		for(int i = 0; i < myValuesOne.length; i++) {
			myValuesOne[i] = con.nextInt();
		}
		
		int[] myValuesTwo = new int[values];
		
		System.out.println("\nEnter the second values : ");
		for(int i = 0; i < myValuesTwo.length; i++) {
			myValuesTwo[i] = con.nextInt();
		}
		
		int[] myValuesThree = new int[values];
		
		boolean operatorFound = false;
		System.out.println("\nResult : ");
		for(int i = 0; i < myValuesThree.length; i++) {
			operatorFound = true;
			if(operator == 1) {
				myValuesThree[i] = myValuesOne[i] + myValuesTwo[i];
			} else if(operator == 2) {
				myValuesThree[i] = myValuesOne[i] - myValuesTwo[i];
			} else if(operator == 3) {
				myValuesThree[i] = myValuesOne[i] * myValuesTwo[i];
			} else if(operator == 4) {
				myValuesThree[i] = myValuesOne[i] / myValuesTwo[i];
			}
		}
		
		if(operatorFound == false) {
			System.out.println("\nOperator not found!");
		}
		
		for(int result: myValuesThree) {
			System.out.println(result);
			
		}
	}
	
	public static int menu() {
	    Scanner con = new Scanner(System.in);
	    int choice;
	    
	    System.out.println("\nPlease select from the menu : ");
	    System.out.println("[1] Input names");
	    System.out.println("[2] Input numbers");
	    System.out.println("[3] Input letters");
	    System.out.println("[4] Display names");
	    System.out.println("[5] Display numbers");
	    System.out.println("[6] Display letters");
	    System.out.println("[7] Sort names A-Z");
	    System.out.println("[8] Sort names Z-A");
	    System.out.println("[9] Sort numbers(Ascending)");
	    System.out.println("[10] Sort numbers(Descending)");
	    System.out.println("[11] Sort letters A-Z");
	    System.out.println("[12] Sort letters Z-A");
	    System.out.println("[13] Odd and Even numbers"); 
	    System.out.println("[14] Positive and Negative numbers");
	    System.out.println("[15] Find lowest value");
	    System.out.println("[16] Find highest value");
	    System.out.println("[17] Use calculator");
	    System.out.println("[0] Exit the program");
	    
	    System.out.print("\nYour choice : ");
	    choice = con.nextInt();
	    
	    return choice;
	}

	public static void main(String[] args) {
		Scanner con = new Scanner(System.in);
		int option, forNames, forNumbers, forLetters;
		
		message();
		
		System.out.print("\nEnter how many names you want : ");
		forNames = con.nextInt();
		System.out.print("Enter how many numbers you want : ");
		forNumbers = con.nextInt();
		System.out.print("Enter how many letters you want : ");
		forLetters = con.nextInt();
		
		myClass[] myNames = new myClass[forNames];
		myClass[] myNumbers = new myClass[forNumbers];
		myClass[] myLetters = new myClass[forLetters];
		
		for(int i = 0; i < myNames.length; i++) {
			myNames[i] = new myClass("", 0, ' ');
		}
		
		for(int i = 0; i < myNumbers.length; i++) {
			myNumbers[i] = new myClass("", 0, ' ');
		}
		
		for(int i = 0; i < myLetters.length; i++) {
			myLetters[i] = new myClass("", 0, ' ');
		}
		
		do {
			
			option = menu();
			
			switch(option) {
			case 1:
				for(int i = 0; i < myNames.length; i++) {
					myNames[i].inputNames();
				}
				break;
				
			case 2:
				for(int i = 0; i < myNumbers.length; i++) {
					myNumbers[i].inputNumbers();
				}
				break;
				
			case 3:
				for(int i = 0; i < myLetters.length; i++) {
					myLetters[i].inputLetters();
				}
				break;
				
			case 4:
				for(int i = 0; i < myNames.length; i++) {
					myNames[i].displayNames();
				}
				break;
				
			case 5:
				for(int i = 0; i < myNumbers.length; i++) {
					myNumbers[i].displayNumbers();
				}
				break;
				
			case 6:
				for(int i = 0; i < myLetters.length; i++) {
					myLetters[i].displayLetters();
				}
				break;
				
			case 7:
				sortNamesAZ(myNames);
				break;
				
			case 8:
				sortNamesZA(myNames);
				break;
				
			case 9:
				sortNumbersAscending(myNumbers);
				break;
				
			case 10:
				sortNumbersDescending(myNumbers);
				break;
				
			case 11:
				sortLettersAZ(myLetters);
				break;
				
			case 12:
				sortLettersZA(myLetters);
				break;
				
			case 13:
				oddEven(myNumbers);
				break;
				
			case 14:
				positiveNegative(myNumbers);
				break;
				
			case 15:
				lowestValue(myNumbers);
				break;
				
			case 16:
				 highestValue(myNumbers);
				 break;
				 
			case 17:
				myCalculator();
				break;
				
			case 0:
				System.out.println("\nThank you!");
				break;
				
			default:
				System.out.println("\nInvalid Input! please select 0 to exit.");
				break;
			}
			
		} while(option != 0);
	}

}
