package jdbcpkg;
import java.sql.*;
public class DisplayEmployee {
    public void displayAll() {
        try {
            JDBCConnection db = new JDBCConnection();
            Connection con = db.getConnection();
            Statement st = con.createStatement();
            String query = "SELECT * FROM employee";
            ResultSet rs = st.executeQuery(query);
            try {
        		while(rs.next()) {
        			System.out.println(rs.getInt("empid")+", "+rs.getString("empname")+", "+rs.getDouble("empsal")+", "+rs.getString("emprole"));
        		}
        	}catch(SQLException ex) {
        		ex.printStackTrace();
        	}
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}