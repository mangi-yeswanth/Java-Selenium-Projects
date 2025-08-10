package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.DDLComands;

public class TestDDLComands {
	DDLComands ddl;
	private Connection connect;
    private String url = "jdbc:mysql://localhost:3306/company";
    private String username = "root";
    private String password = "Yesh@66543211";
	

    @BeforeEach
    public void setup() {
        try {
            connect = DriverManager.getConnection(url, username, password);
            ddl = new DDLComands();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @AfterEach
    public void tearDown() {
        try {
            if (connect != null && !connect.isClosed()) {
                connect.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @DisplayName("test on inserting ")
	@Test
	public void testInsertEmployee() {
		boolean result = ddl.insertEmployee(3, "saara", 35000, "tech team");
		assertTrue(result, "Insertion failed");
	}
    @DisplayName("test on Updation ")
	@Test
	public void testUpdateEmployee() {
		boolean result = ddl.updateEmployee(4, "deadpool", 70000, "Senior Analyst");
		assertTrue(result, "Update failed");
	}
    @DisplayName("test on deletion")
	@Test
	public void testDeleteEmployee() {
		ddl.deleteEmployee(1);
		boolean result = ddl.deleteEmployee(3);
		assertTrue(result, "Deletion failed");
	}
}
