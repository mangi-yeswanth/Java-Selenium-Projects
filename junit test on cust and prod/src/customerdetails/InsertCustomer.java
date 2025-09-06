package customerdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertCustomer {

    public boolean insert(Customer customer) {
        boolean result = false;
        Connection connect = null;
        PreparedStatement ps = null;

        try {
            JDBCConnection jdbc = new JDBCConnection();
            connect = jdbc.getConnection();

            String query = "INSERT INTO customer (cust_id, cust_name, cust_contact, cust_gender, cust_address, cust_city, cust_zipcode) " +
                           "VALUES (?, ?, ?, ?, ?, ?, ?)";
            ps = connect.prepareStatement(query);

            ps.setInt(1, customer.getCust_id());
            ps.setString(2, customer.getCust_name());
            ps.setString(3, customer.getCust_contact());
            ps.setString(4, customer.getCust_gender());
            ps.setString(5, customer.getCust_address());
            ps.setString(6, customer.getCust_city());
            ps.setString(7, customer.getCust_zipcode());

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
