import java.util.Scanner;
import java.util.Arrays;
public class Main {
	
	static Student[] removedList(Student[] myStudents, String removed) {
		int index = -1;
		
		for(int i = 0; i < myStudents.length; i++) {
			if(myStudents[i].studentName.equals(removed)) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("\nStudent name not found!");
			return myStudents;
		}
		
		Student[] afterRemoved = new Student[myStudents.length - 1];
		for(int i = 0, j = 0; i < myStudents.length; i++) {
			if(i != index) {
				afterRemoved[j++] = myStudents[i];
			}
		}
		
		System.out.println("\nStudent successfully removed!");
		return afterRemoved;
	}
				
	static void attendanceChecker(Student[] myStudent) {
		Scanner s = new Scanner(System.in);
		char checker;
		int presents = 0;
		int absents = 0;
		
		for(int i = 0; i < myStudent.length; i++) {
			System.out.print("\nEnter p or a : ");
			checker = s.next().charAt(0);
			
			if(checker == 'a' || checker == 'A') {
				System.out.println("\nNot present today : " + myStudent[i].studentName);
				absents++;
			} else if(checker == 'p' || checker == 'P') {
				System.out.println("\nPresent today : " + myStudent[i].studentName);
				presents++;
			}			
		}
		
		System.out.println("\nTotal number of present : " + presents);
		System.out.println("Total number of absent : " + absents);
		System.out.println("Total number of students : " + myStudent.length);
	}
	
	static void sortStudentsByName(Student[] myStudent) {
		int n = myStudent.length;
		
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(myStudent[i].studentName.compareTo(myStudent[i].studentName) > 0) {
					String temp1 = myStudent[i].studentName;
					char temp2 = myStudent[i].presentAbsent;
					
					myStudent[i].studentName = myStudent[j + 1].studentName;
					myStudent[j++].studentName = temp1;
					myStudent[i].presentAbsent = myStudent[j + 1].presentAbsent;
					myStudent[j + 1].presentAbsent = temp2;
				}
			}
		}		
	}
	
	static int menu() {
		Scanner s = new Scanner(System.in);
		int choice;
		
		System.out.println("\nEnter your choice : ");
		System.out.println("[1] Check student attendance");
		System.out.println("[2] Add new student");
		System.out.println("[3] Remove student from list");
		System.out.println("[4] Sort students by name");
		System.out.println("[5] Display student names");
		System.out.println("[0] Exit");
		
		System.out.print("\nEnter your choice : ");
		choice = s.nextInt();
		
		return choice;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student[] myStudent = new Student[5];
		int option;
		
		System.out.println("ATTENDANCE CHECKER SYSTEM");
        
		for(int i = 0; i < myStudent.length; i++) {
			myStudent[i] = new Student("", ' ');
		}
		
		myStudent[0].studentName = "Admin1";
		myStudent[0].presentAbsent = ' ';
		myStudent[1].studentName = "Admin2";
		myStudent[1].presentAbsent = ' ';
		myStudent[2].studentName = "Admin3";
		myStudent[2].presentAbsent = ' ';
		myStudent[3].studentName = "Admin4";
		myStudent[3].presentAbsent = ' ';
		myStudent[4].studentName = "Admin5";
		myStudent[4].presentAbsent = ' ';
		
		do {
			
			option = menu();
			
			switch(option) {
			case 1:
				attendanceChecker(myStudent);
				break;
			case 2:			
				int add;
				
				System.out.print("\nEnter how many student you want to add : ");
				add = s.nextInt();
				
				Student[] newStudent = new Student[myStudent.length + add];
				
				for(int i = 0; i < myStudent.length; i++) {
					newStudent[i] = myStudent[i];
				}
				
				for(int i = myStudent.length; i < newStudent.length; i++) {
					s.nextLine();
					System.out.print("\nEnter the name of the student : ");
					String name = s.nextLine();
						
					newStudent[i] = new Student(name, ' ');
				}
				
				myStudent = newStudent;			
				break;
			case 3:
				String remove;
				
				System.out.print("\nEnter student name : ");
				remove = s.nextLine();
				
				myStudent = removedList(myStudent, remove);
				break;
			case 4:
				sortStudentsByName(myStudent);
				break;
			case 5:
				for(int i = 0; i < myStudent.length; i++) {
					myStudent[i].displayStudents(i + 1);
				}
				break;
			case 0:
				System.out.println("\nThank you!");
				break;
			default: 
				System.out.println("\nInvalid!");
				break;
			}
			
		} while(option != 0);
	}

}
