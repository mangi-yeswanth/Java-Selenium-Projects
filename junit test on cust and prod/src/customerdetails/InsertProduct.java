package customerdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertProduct {

    public boolean insert(int cust_id, Product product) {
        boolean result = false;
        Connection connect = null;
        PreparedStatement ps = null;

        try {
            JDBCConnection jdbc = new JDBCConnection();
            connect = jdbc.getConnection();

            String query = "INSERT INTO product (cust_id, product_id, product_code, product_description, product_price, product_quantity, product_expdate) " +
                           "VALUES (?, ?, ?, ?, ?, ?, ?)";
            ps = connect.prepareStatement(query);

            ps.setInt(1, cust_id);
            ps.setInt(2, product.getProduct_id());
            ps.setString(3, product.getProduct_code());
            ps.setString(4, product.getProduct_description());
            ps.setDouble(5, product.getProduct_price());
            ps.setInt(6, product.getProduct_quantity());
            ps.setString(7, product.getProduct_expdate());

            int rows = ps.executeUpdate();
            result = rows > 0;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) ps.close();
                if (connect != null) connect.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return result;
    }
}
