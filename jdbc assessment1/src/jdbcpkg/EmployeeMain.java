package jdbcpkg;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InsertEmployee insert = new InsertEmployee();
        DeleteEmployee delete = new DeleteEmployee();
        UpdateEmployee update = new UpdateEmployee();
        DisplayEmployee display = new DisplayEmployee();

        int choice;
        do {
            System.out.println("Employee Menu");
            System.out.println("--------------");
            System.out.println("1. Insert a new Record");
            System.out.println("2. Delete a record");
            System.out.println("3. Update the record");
            System.out.println("4. Display all the records");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:{
                insert.insert();
                break;
                }
                case 2:{
                	delete.delete();
                	break;
                }
                case 3:{
                	update.update();
                	break;
                }
                case 4:{
                	display.displayAll();
                	break;
                }
                case 5:{
                	System.out.println("Exiting...");
                	return;
                }
                default:{
                	System.out.println("Invalid choice. Try again.");
                	break;
                }
            }

        } while (choice<6&&choice>0);

    }
}
