package jdbcpkg;

import java.sql.*;
import java.util.Scanner;

public class InsertEmployee {
	private int id;
	private String name;
	private double salary;
	public String role;
	public void insert() {
		try  {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter employee ID: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter employee Name: ");
			name = sc.nextLine();
			sc.nextLine();
			System.out.print("Enter employee salary: ");
			salary = sc.nextDouble();
			sc.nextLine();
			System.out.print("Enter employee role: ");
			role=sc.nextLine();
			JDBCConnection db = new JDBCConnection();
			Connection con = db.getConnection();
			Statement st = con.createStatement();
			String query = "INSERT INTO Employee (empid, empname, empsal, emprole) VALUES (" + id + ", '" + name + "', " + salary + ", '" + role + "')";
			st.executeUpdate(query);
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}