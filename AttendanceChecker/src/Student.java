
public class Student {
	
	String studentName;
	char presentAbsent;
	
	Student(String studentName, char presentAbsent){
		this.studentName = studentName;
		this.presentAbsent = presentAbsent;
	}
	
	void displayStudents(int num) {
		System.out.println("\nStudent name[" + num + "] : " + studentName);
		System.out.println("Attendance[" + num + "]: " + presentAbsent);
	}
}
