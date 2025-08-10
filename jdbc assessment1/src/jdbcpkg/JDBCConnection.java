package jdbcpkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnection {
	Connection connect = null;

	public Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/employee";

			// Replace with your MySQL username
			String username = "root";

			// Replace with your MySQL password
			String password = "Yesh@66543211";

			// Load MySQL Type-4 driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			// Establish connection
			connect = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return connect;
	}
}