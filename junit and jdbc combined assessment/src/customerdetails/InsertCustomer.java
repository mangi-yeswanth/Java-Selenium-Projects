package customerdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertCustomer {

	public boolean insert(String cust_name, String cust_contact, String cust_gender, String cust_address,
			String cust_city, String cust_zipcode) {
		boolean result = false;
		Connection connect = null;
		PreparedStatement ps = null;

		try {
			JDBCConnection jdbc = new JDBCConnection();
			connect = jdbc.getConnection();

			String query = "INSERT INTO customer (cust_name, cust_contact, cust_gender, cust_address, cust_city, cust_zipcode) VALUES (?, ?, ?, ?, ?, ?)";
			ps = connect.prepareStatement(query);

			ps.setString(1, cust_name);
			ps.setString(2, cust_contact);
			ps.setString(3, cust_gender);
			ps.setString(4, cust_address);
			ps.setString(5, cust_city);
			ps.setString(6, cust_zipcode);
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