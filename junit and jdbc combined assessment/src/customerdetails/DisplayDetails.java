package customerdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DisplayDetails{

    public boolean display(int cust_id) {
        boolean found = false;
        Connection connect = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            JDBCConnection jdbc = new JDBCConnection();
            connect = jdbc.getConnection();

            String query = "SELECT p.product_id, p.product_code, p.product_description, p.product_quantity " +
                    "FROM Product p " +
                    "WHERE p.cust_id = ?";
            ps = connect.prepareStatement(query);
            ps.setInt(1, cust_id);

            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Product ID: " + rs.getInt("product_id"));
                System.out.println("Code: " + rs.getString("product_code"));
                System.out.println("Description: " + rs.getString("product_description"));
                System.out.println("Quantity Bought: " + rs.getInt("product_quantity"));
                found = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (connect != null) connect.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return found;
    }
}