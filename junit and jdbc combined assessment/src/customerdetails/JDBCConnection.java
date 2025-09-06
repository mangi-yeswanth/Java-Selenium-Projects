package customerdetails;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
	Connection connect = null;

	public Connection getConnection() {
		try {
			String url = "jdbc:mysql://localhost:3306/customer";

			String username = "root";

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