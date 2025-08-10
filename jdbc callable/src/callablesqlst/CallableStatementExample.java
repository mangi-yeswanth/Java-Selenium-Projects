package callablesqlst;
import java.util.Scanner;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CallableStatementExample {
  static Connection con=null;
	public static void main(String args[]) throws Exception {
		Scanner sc=new Scanner(System.in);
	try {
		// Replace with your database name
      String url="jdbc:mysql://localhost:3306/callable";

      // Replace with your MySQL username
      String username = "root";

      // Replace with your MySQL password
      String password = "Yesh@66543211";

	
      // Load MySQL Type-4 driver class
       Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish connection
        con = DriverManager.getConnection(url, username, password);
	  //Preparing a CallableStateement
     CallableStatement cstmt = con.prepareCall("{call myProcedure(?, ?, ?)}");
     System.out.print("Enter number of students to insert: ");
     int count = sc.nextInt();
     sc.nextLine();

     for (int i = 1; i <= count; i++) {
         System.out.println("Student " + (i) + " details:");

         System.out.print("Enter ID: ");
         int id = sc.nextInt();
         sc.nextLine();

         System.out.print("Enter Name: ");
         String name = sc.nextLine();

         System.out.print("Enter Department: ");
         String dept = sc.nextLine();
         
         cstmt.setInt(1, id);
         cstmt.setString(2, name);
         cstmt.setString(3, dept);
         cstmt.execute();
     }

     System.out.println("\nAll rows inserted successfully.");

     cstmt.execute();
     System.out.println("Rows inserted ....");
	}catch(SQLException se) {se.printStackTrace();}
	}
}
