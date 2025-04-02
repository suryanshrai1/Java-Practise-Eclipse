package com.java.DatabaseConnectivity;

import java.sql.*;

public class EmployeeDetails {
	public static void main(String[] args) {
		// Database connection details
		String jdbcURL = "jdbc:mysql://localhost:3306/employee";
		String dbUser = "root";
		String dbPassword = "Surya#589";

		// SQL Query to fetch employee details
		String query = "SELECT * FROM employee_details";

		try {
			// Load MySQL JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish connection
			Connection conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);

			// Create a statement
			Statement stmt = conn.createStatement();

			// Execute the query
			ResultSet rs = stmt.executeQuery(query);

			// Display Employee Details
			System.out.println("Employee Details:");
			System.out.println("ID | Name | Department | Salary");
			System.out.println("---------------------------------");

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String department = rs.getString("department");
				double salary = rs.getDouble("salary");

				System.out.println(id + " | " + name + " | " + department + " | " + salary);
			}

			// Close connections
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
