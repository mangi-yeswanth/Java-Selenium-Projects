package customerdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertProduct {

	public boolean insert(int cust_id, String product_code, String product_description, double product_price,
			int product_quantity, String product_expdate) {
		boolean result = false;
		Connection connect = null;
		PreparedStatement ps = null;

		try {
			JDBCConnection jdbc = new JDBCConnection();
			connect = jdbc.getConnection();

			String query = "INSERT INTO product (cust_id, product_code, product_description, product_price, product_quantity, product_expdate) VALUES (?, ?, ?, ?, ?, ?)";
			ps = connect.prepareStatement(query);

			ps.setInt(1, cust_id);
			ps.setString(2, product_code);
			ps.setString(3, product_description);
			ps.setDouble(4, product_price);
			ps.setInt(5, product_quantity);
			ps.setString(6, product_expdate);

			int rows = ps.executeUpdate();
			result = rows > 0;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (connect != null)
					connect.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return result;
	}
}