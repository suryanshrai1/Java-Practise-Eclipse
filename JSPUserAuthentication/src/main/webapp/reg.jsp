<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Registration</title>
</head>
<body>

	<%
	String un = request.getParameter("un").trim();  // Trim username
	String pwd = request.getParameter("pwd").trim();  
	String add = request.getParameter("add").trim();  
	String mob = request.getParameter("mob").trim();  


try{
	// Load the MySQL driver
	Class.forName("com.mysql.cj.jdbc.Driver");

	// Establish the connection to the database
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Surya#589");

	// SQL query with placeholders (?)
	String query = "INSERT INTO users (`username`, `password`, `address`, `mobile_no`) VALUES (?, ?, ?, ?)";

	// Create a PreparedStatement
	PreparedStatement preparedStatement = connection.prepareStatement(query);

	// Set the values for the placeholders
	preparedStatement.setString(1, un);  // First placeholder: username
	preparedStatement.setString(2, pwd);  
	preparedStatement.setString(3, add);  
	preparedStatement.setString(4, mob);  

	// Execute the update (Insert data into the database)
	preparedStatement.executeUpdate();

	// Redirect to the success page
	response.sendRedirect("regSuccess.html");
	
}
catch(Exception e){
	System.out.println(e);
}

%>

</body>
</html>