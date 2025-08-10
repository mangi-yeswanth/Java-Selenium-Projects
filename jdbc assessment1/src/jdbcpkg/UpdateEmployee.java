package jdbcpkg;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateEmployee {
    public void update() {
        try{
        	Scanner sc = new Scanner(System.in);
            System.out.print("Enter employee ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new Name: ");
            String name = sc.nextLine();
            System.out.print("Enter new Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter new Role: ");
            String role = sc.nextLine();

            JDBCConnection db = new JDBCConnection();
            Connection con = db.getConnection();
            Statement st = con.createStatement();
            String query = "UPDATE employee SET empname = '" + name + "', empsal = " + salary +
                           ", emprole = '" + role + "' WHERE empid = " + id;
            st.executeUpdate(query);
            System.out.println("the row is updated");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}