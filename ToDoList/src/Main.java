import java.util.Scanner;
public class Main {
	public static String[] doneTask(String[] myTasks) {
		Scanner scan = new Scanner(System.in);
	    int done;
	    
	    while (true) {
	      System.out.println("\nYour tasks : ");
	      
	      for (int i = 0; i < myTasks.length; i++) {
	        System.out.println("[" + i + "]" + myTasks[i]);
	      }
	      
	      System.out.print("\nSelect the number of task \ndone(-1 to exit) : ");
	      done = scan.nextInt();
	      
	      if (done == -1) {
	        System.out.println("\nExiting...");
	        break;
	      }
	      
	      if (done < 0 || done >= myTasks.length) {
	        System.out.println("\nInvalid task number. Please try again.");
	        continue;
	      }
	      
	      String[] remainingTask = new String[myTasks.length - 1];
	      for (int i = 0, j = 0; i < myTasks.length; i++) {
	        if (i != done) {
	          remainingTask[j++] = myTasks[i];
	        }
	      }
	      
	      myTasks = remainingTask;
	      
	      System.out.println("[" + done + "] marked as done");
	      
	      if (myTasks.length == 0) {
	    	String[] doneTasks = new String[myTasks.length];
	    	
	    	myTasks = doneTasks;
	        System.out.println("\nAll task are done!");
	        return doneTasks;
	      }
	    }
	    
	    return myTasks;
	}
	
	public static String[] addTask(String[] myTasks) {
		 Scanner scan = new Scanner(System.in);
		    int add;
		    
		    System.out.print("\nEnter how many task you want to add : ");
		    add = scan.nextInt();
		    
		    String[] newTasks = new String[myTasks.length + add];
		    for (int i = 0; i < myTasks.length; i++) {
		      newTasks[i] = myTasks[i];
		    }
		    
		    System.out.println("\nAdd new tasks : ");
		    for (int i = myTasks.length; i < newTasks.length; i++) {
		      scan.nextLine();
		      System.out.print("Enter task : " + (i - myTasks.length + 1) + " : ");
		      
		      newTasks[i] = scan.nextLine();             
		    }
		    System.out.println("\nTask added successfully!");
		                      
		    return newTasks; 
	}
	
	public static String[] removeTask(String[] myTasks) {
		Scanner scan = new Scanner(System.in);
	    int remove;
	    int index = -1;
	    
	    System.out.print("\nEnter the number of task to remove : ");
	    remove = scan.nextInt();
	    
	    for (int i = 0; i < myTasks.length; i++) {
	      if (remove == i) {
	        index = i;
	        break;
	      }            
	    }
	    
	    if (index == -1) {
	      System.out.println("\nTask to remove not found!");
	      return myTasks;
	    }
	    
	    String[] newTaskList = new String[myTasks.length - 1];
	    for (int i = 0, j = 0; i < myTasks.length; i++) {
	     if (i != index) {
	      newTaskList[j++] = myTasks[i];
	      }
	    }
	    
	    System.out.println("\nTask removed successfully!");
	    return newTaskList;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("To Do List Java");
		for (int i = 0; i <= 50; i++) {
			System.out.print("-");
		}
		
		System.out.print("\nEnter how many task you want to add : ");
		int add = scan.nextInt();
		int choice;
		
		String[] myTasks = new String[add];
		
		System.out.println("\nEnter your tasks : ");
		for (int i = 0; i < myTasks.length; i++) {
			myTasks[i] = scan.nextLine();
		}
		
		do {
			
			System.out.println("\n[1] Show tasks");
			System.out.println("[2] Done task");
			System.out.println("[3] Add task");
			System.out.println("[4] Remove task");
			System.out.println("[0] Exit");
			
			System.out.print("\nEnter you choice : ");
			choice = scan.nextInt();
			
		switch (choice) {
		case 1:
			 if (myTasks.length - 1 == -1) {
		          System.out.println("\nNo task  available.");
		     } else {
		        for (int i = 0; i <  myTasks.length; i++) {
		          System.out.println(myTasks[i]);
		        }
		      }
		        break;
		       case 2:
		       myTasks = doneTask(myTasks);
		        break;
		       case 3:
		        myTasks = addTask(myTasks);
		        break;
		       case 4:
		        myTasks = removeTask(myTasks);
		        break;
		       case 0:
		        System.out.println("\nThank you!");
		        break;
		       default:
		    	System.out.println("\nInvalid input");
		    	break;
			}
			
		} while (choice != 0);
	}

}
