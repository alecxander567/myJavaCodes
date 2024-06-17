import java.util.Scanner;
public class Books {
   
	String bookName;
	int bookNum;
	
	Books(String bookName, int bookNum){
		this.bookName = bookName;
		this.bookNum = bookNum;
	}
	
	void displayBooks() {
		System.out.println("\nName of Book : " + bookName);
		System.out.println("Book number : " + bookNum);
	}
}
