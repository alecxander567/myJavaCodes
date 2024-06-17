package randomSortingNamesLettersNumbersPlusCalculator;
import java.util.Scanner;
import java.util.Scanner;
public class myClass {
	
	String names;
	int numbers;
	char letters;
	
	myClass(String names, int numbers, char letters){
		this.names = names;
		this.numbers = numbers;
		this.letters = letters;
	}
	
	void inputNames() {
		Scanner con = new Scanner(System.in);
		
		System.out.print("\nEnter name : ");
		this.names = con.nextLine();
	}
	
	void inputNumbers() {
		Scanner con = new Scanner(System.in);
		
		System.out.print("\nEnter number : ");
		this.numbers = con.nextInt();
	}
	
	void inputLetters() {
		Scanner con = new Scanner(System.in);
		
		System.out.print("\nEnter letter : ");
		this.letters = con.next().charAt(0);
	}
	
	void displayNames() {
		System.out.println("\nName : " + names);
	}
	
	void displayNumbers() {
		System.out.println("\nNumber : " + numbers);
	}
	
	void displayLetters() {
		System.out.println("\nLetter : " + letters);
	}

}
