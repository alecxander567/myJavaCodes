import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int correctAns = 0;
		int incorrectAns = 0;
		char ans1, ans2, ans3, ans4, ans5, repeat;
		int total = 5;
		
		System.out.println("Java Quiz Game");
		
		do {
			
		System.out.println("\n1. What is Java known for?");
		System.out.println("\nA. Known for a robust programming language");
		System.out.println("B. Known for styling");
		System.out.println("C. Known for Hardware Development");
		
		System.out.print("\nAnswer : ");
		ans1 = s.next().charAt(0);
		
		if(ans1 == 'A' || ans1 == 'a') {
			correctAns++;
		} else {
			incorrectAns++;
		}
		
		System.out.println("\n2. Can Java make an application?");
		System.out.println("\nA.No, because it is only used for styling");
		System.out.println("B. Yes, Java have made some of the best applications until now");
		System.out.println("C. I don't know");
		
		System.out.print("\nAnswer : ");
		ans2 = s.next().charAt(0);
		
		if(ans2 == 'B' || ans2 == 'b') {
			correctAns++;
		} else {
			incorrectAns++;
		}
		
		System.out.println("\n3. True or false : Java is a low-level programming language");
		System.out.println("\nA.True");
		System.out.println("B. False");
		System.out.println("C. both A and B");
		
		System.out.print("\nAnswer : ");
		ans3 = s.next().charAt(0);
		

		if(ans3 == 'B' || ans3 == 'b') {
			correctAns++;
		} else {
			incorrectAns++;
		}
		
		System.out.println("\n4. Is ChatGPT made out of Java?");
		System.out.println("\nA.Yes");
		System.out.println("B. No, only helped the efficiency");
		System.out.println("C. No, because ChatGPT is known to be built by Python Programming language");
		
		System.out.print("\nAnswer : ");
		ans4 = s.next().charAt(0);
		

		if(ans4 == 'C' || ans4 == 'c') {
			correctAns++;
		} else {
			incorrectAns++;
		}
		
		System.out.println("\n5. Is it true that Minecraft was built using Java?");
		System.out.println("\nA.Yes");
		System.out.println("B. No");
		System.out.println("C. I don't know");
		
		System.out.print("\nAnswer : ");
		ans5 = s.next().charAt(0);
		
		if(ans5 == 'A' || ans5 == 'a') {
			correctAns++;
		} else {
			incorrectAns++;
		}
		
		
		System.out.println("\nThe quiz has been finished see your results");
		System.out.println("Total number of correct : " + correctAns);
		System.out.println("Total number of incorrect : " + incorrectAns);
		System.out.println("\nTotal Score : " + correctAns + " / " + total);
		
		System.out.print("\nDo you want ot repeat the quiz? ");
		repeat = s.next().charAt(0);
		
		} while(repeat != 'N' && repeat != 'n');
		
		System.out.println("\nThank you!");
	}

}
