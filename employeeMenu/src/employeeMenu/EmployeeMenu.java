package employeeMenu;

import java.util.Scanner;

class EmployeeMenu {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        EmployeePersonalDetails personal = new EmployeePersonalDetails();
	        EmployeeProfessionalDetails professional = new EmployeeProfessionalDetails();
	        EmployeeSalaryDetails salary = new EmployeeSalaryDetails();
	        EmployeeLeaveDetails leave = new EmployeeLeaveDetails();
	        EmployeeProjectDetails project = new EmployeeProjectDetails();

	        while (true) {
	            System.out.println("Employee Menu");
	            System.out.println("-------------");
	            System.out.println("1. Display Employee Personal Details.");
	            System.out.println("2. Display Employee Professional Details.");
	            System.out.println("3. Display Employee Salary Details.");
	            System.out.println("4. Display Employee Earned Leaves and Casual Leaves.");
	            System.out.println("5. Display Employee Projects Undertaken.");
	            System.out.println("6. Exit the Menu.");
	            System.out.print("Enter your choice: ");

	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    personal.display();
	                    break;
	                case 2:
	                    professional.display();
	                    break;
	                case 3:
	                    salary.display();
	                    break;
	                case 4:
	                    leave.display();
	                    break;
	                case 5:
	                    project.display();
	                    break;
	                case 6:
	                    System.out.println("Exiting the menu.");
	                    
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	            
	        }
	    }
	}
