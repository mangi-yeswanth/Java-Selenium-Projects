package jdbcpkg;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteEmployee {
	private int empid;
    public void delete() {
        try {
        	Scanner sc = new Scanner(System.in);
            System.out.print("Enter Employee ID to delete: ");
            empid = sc.nextInt();

            JDBCConnection db = new JDBCConnection();
            Connection con = db.getConnection();
            Statement st = con.createStatement();
            String query = "DELETE FROM Employee WHERE empid = " + empid;
            st.executeUpdate(query);
            con.close();
            System.out.println("row is deleted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}