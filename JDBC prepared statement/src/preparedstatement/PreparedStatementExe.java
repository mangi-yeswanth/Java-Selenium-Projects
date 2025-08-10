package preparedstatement;
import java.sql.*;

public class PreparedStatementExe {
	public static void main(String[] args) {
	 String url= "jdbc:mysql://localhost:3306/employee";
     String username = "root";
     String password = "Yesh@66543211";
     String insertSQL = "INSERT INTO employee (empid,empname,empsal,emprole) VALUES (?,?,?,?)";
     String updateSQL = "update employee set empname=?,empsal=?,emprole=? where empid=?";
     String deleteSQL="delete from employee where empid=?";
         try (
        		 
                 Connection conn = DriverManager.getConnection(url, username, password);
                 PreparedStatement pstmtins = conn.prepareStatement(insertSQL);
        		 PreparedStatement pstmtdel = conn.prepareStatement(deleteSQL);
        		 PreparedStatement pstmtupd = conn.prepareStatement(updateSQL);
             ) {
        	 // Delete record first
             pstmtdel.setInt(1, 1007);
             int rowsDeleted = pstmtdel.executeUpdate();
             System.out.println(rowsDeleted + " row(s) deleted.");

             // Insert record
             pstmtins.setInt(1, 1007);
             pstmtins.setString(2, "drutharastr");
             pstmtins.setDouble(3, 400000);
             pstmtins.setString(4, "senior manager");
             int rowsInserted = pstmtins.executeUpdate();
             System.out.println(rowsInserted + " row(s) inserted.");

             // Update record
             pstmtupd.setString(1, "druth");
             pstmtupd.setDouble(2, 50000);
             pstmtupd.setString(3, "ceo2");
             pstmtupd.setInt(4, 1007);
             int rowsUpdated = pstmtupd.executeUpdate();
             System.out.println(rowsUpdated + " row(s) updated.");
       
             } catch (SQLException e) {
                e.printStackTrace();
             }
}
}
