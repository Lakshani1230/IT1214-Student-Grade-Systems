import java.util.*;

class Main{
	private static ArrayList <Student> studentList= new ArrayList<>();
	private static Scanner sc =new Scanner(System.in);
	
	
 public static void main(String[]arg){
	int choice;
	
	do{
		System.out.println("\n--- Student Grade Management System ---");
            System.out.println("1. Add a Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search for a Student by ID");
            System.out.println("4. Calculate and Display Average Mark");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
		
		
		choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
					System.out.println("Enter Id");
					String id=sc.nextLine();
					System.out.println("Enter Name");
					String name=sc.nextLine();
					System.out.println("enter Mark");
					int m=sc.nextInt();
					sc.nextLine();
					
					Student s1=new Student(id,name,m);
					studentList.add(s1);
					System.out.println("Added");
                    
                    break;
                case 2:
					if(studentList.isEmpty()){
						System.out.println("No records");
					}
					else{
						for(Student s:studentList){
							s.displayStudentDetails();
						}
					}
                    
                    break;
                case 3:
                    if(studentList.isEmpty()){
						System.out.println("No records");
					}
					else{
						System.out.println("Enter st Id");
						String search=sc.nextLine();
						boolean found=false;
						
						for(Student s:studentList){
							if(s.getStudentId().equalsIgnoreCase(search)){
								System.out.println("found");
								found=true;
								s.displayStudentDetails();
							}
							
						}if(!found){
							System.out.println("Student with ID '" + search + "' not found.");
						}
						
					}
					
                    break;
					
//Add student input functionality
                case 4:
					  if (studentList.isEmpty()) {
						System.out.println("No records found to calculate an average.");
					} else {
						double sum = 0;
						for (Student s : studentList) {
							sum = sum + s.getMarks();
						}
						double avg = sum / studentList.size();
						System.out.println("Total number of Students = " + studentList.size());
						System.out.println("Average marks of Students = " + avg);
					}
                    
                    break;
                case 5:
                    System.out.println("Exiting system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please select an option from 1 to 5.");
			}
	}while (choice != 5);	
        
			
		
	}
 
 }