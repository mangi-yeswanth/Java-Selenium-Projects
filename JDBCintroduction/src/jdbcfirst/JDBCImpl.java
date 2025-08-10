package jdbcfirst;

import java.sql.*;
public class JDBCImpl{
    public static void main(String[] args)
    {
        String url= "jdbc:mysql://localhost:3306/Student";
        String username = "root";
        String password = "Yesh@66543211";
        String createTableSQL="CREATE TABLE student(id INT,name varchar(50),age int,gender varchar(20),email varchar(100),phone varchar(20),department varchar(20),location varchar(30),country varchar(50));";
        String insertSQL = " INSERT INTO student (id, name, age, gender, email, phone, department, location,country)VALUES(1, 'priya', 20, 'F', 'priya@gmail.com', '4653165276', 'CSE','Hyderabad', 'India'),"
        		+ "(2, 'Aarathi', 21, 'F', 'aarathi@gmail.com', '4653552317', 'ECE', 'Mumbai', 'India'),"
        		+ "(3, 'Ishapriya', 19, 'F', 'ishapriya@gmail.com', '6532564417', 'IT', 'Delhi', 'India'),"
        		+ "(4, 'Karn', 22, 'M', 'karn@gmail.com', '6654985624', 'EEE', 'Chennai', 'India'),"
        		+ "(5, 'draupathi', 20, 'F', 'draupathi@gmail.com', '4456124756', 'CSE', 'Kolkata', 'India'),"
        		+ "(6, 'arjun', 21, 'M', 'arjun@gmail.com', '6665546544', 'CSE', 'Pune', 'India'),"
        		+ "(7, 'bheema', 23, 'M', 'Bheema@gmail.com', '5456225865', 'IT', 'Bangalore', 'India'),"
        		+ "(8, 'nakula', 20, 'M', 'nakula@gmail.com', '939842320', 'ECE', 'Jaipur', 'India'),"
        		+ "(9, 'radha', 21, 'F', 'radha@gmail.com', '9945658756', 'CIVIL', 'Ahmedabad', 'India'),"
        		+ "(10, 'krishna', 22, 'M', 'vasudevkrish@gmail.com', '1010101010', 'EEE', 'andhra pradesh', 'India');";
        String deleteSQL = "DELETE FROM student WHERE id IN (2, 4)";
        String updateSQL ="UPDATE student SET name = 'draupathi arjun',email = 'draupathiarjun@gmail.com',location = 'Noida' WHERE id = 5 ;";
        String selqry="select * from student";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(url, username, password);
            Statement st = c.createStatement();
           // st.executeUpdate(createTableSQL);
           // st.executeUpdate(insertSQL);
           // st.executeUpdate(deleteSQL);
            //st.executeUpdate(updateSQL);
           
            ResultSet rs = st.executeQuery(selqry);
            try {
            		while(rs.next()) {
            			System.out.println(rs.getInt("id")+", "+rs.getString("name")+", "+rs.getInt("age")+", "+rs.getString("gender")+", "+rs.getString("email")+", "+rs.getString("phone")+", "+rs.getString("department")+", "+rs.getString("location")+", "+rs.getString("country"));
            		}
            	}catch(SQLException ex) {
            		ex.printStackTrace();
            	}
            st.close();
            c.close();
            System.out.println("Connection closed.");
        }
        catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: "
                               + e.getMessage());
        }
        catch (SQLException e) {
            System.err.println("SQL Error: "
                               + e.getMessage());
        }
    }
}
