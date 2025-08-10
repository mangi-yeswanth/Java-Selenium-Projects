package main;

import java.sql.*;

public class DDLComands {
	 String url= "jdbc:mysql://localhost:3306/company";
     String username = "root";
     String password = "Yesh@66543211";
     public boolean insertEmployee(int id, String name, double salary, String role) {
         String sql = "INSERT INTO employee (empid, empname, empsal, emprole) VALUES (?, ?, ?, ?)";
         try (Connection con = DriverManager.getConnection(url, username, password);
              PreparedStatement pst = con.prepareStatement(sql)) {
             pst.setInt(1, id);
             pst.setString(2, name);
             pst.setDouble(3, salary);
             pst.setString(4, role);
             return pst.executeUpdate() > 0;
         } catch (SQLException e) {
             e.printStackTrace();
             return false;
         }
     }

     public boolean updateEmployee(int id, String name, double salary, String role) {
         String sql = "UPDATE employee SET empname=?, empsal=?, emprole=? WHERE empid=?";
         try (Connection con = DriverManager.getConnection(url, username, password);
              PreparedStatement pst = con.prepareStatement(sql)) {
             pst.setString(1, name);
             pst.setDouble(2, salary);
             pst.setString(3, role);
             pst.setInt(4, id);
             return pst.executeUpdate() > 0;
         } catch (SQLException e) {
             e.printStackTrace();
             return false;
         }
     }

     public boolean deleteEmployee(int id) {
         String sql = "DELETE FROM employee WHERE empid=?";
         try (Connection con = DriverManager.getConnection(url, username, password);
              PreparedStatement pst = con.prepareStatement(sql)) {
             pst.setInt(1, id);
             return pst.executeUpdate() > 0;
         } catch (SQLException e) {
             e.printStackTrace();
             return false;
         }
     }
     public boolean truncate() {
    	 String sql="TRUNCATE TABLE employee";
    	 try (Connection con = DriverManager.getConnection(url, username, password);
    			Statement st=con.createStatement()){
    		 st.executeUpdate(sql);
    		 return st.executeUpdate(sql)>0;
    	 }
    	 catch(Exception e) {
    		 e.printStackTrace();
    		 return false;
    	 }
    	 
     }
}
