package customerdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BuyProduct {

    public boolean buy(Customer customer, Product product, int qty) {
        boolean success = false;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            JDBCConnection db = new JDBCConnection();
            con = db.getConnection();

            // Check product availability
            ps = con.prepareStatement("SELECT product_price, product_quantity FROM Product WHERE product_id=? AND cust_id=?");
            ps.setInt(1, product.getProduct_id());
            ps.setInt(2, customer.getCust_id());
            rs = ps.executeQuery();

            if (rs.next()) {
                double price = rs.getDouble("product_price");
                int available = rs.getInt("product_quantity");

                if (qty <= available) {
                    double total = qty * price;
                    System.out.println("Purchase successful! Total Price = " + total);

                    PreparedStatement update = con.prepareStatement(
                        "UPDATE Product SET product_quantity = product_quantity - ? WHERE product_id=?"
                    );
                    update.setInt(1, qty);
                    update.setInt(2, product.getProduct_id());
                    update.executeUpdate();
                    update.close();

                    success = true;
                } else {
                    System.out.println("Not enough stock!");
                }
            } else {
                System.out.println("Product not found for this customer!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return success;
    }
}
