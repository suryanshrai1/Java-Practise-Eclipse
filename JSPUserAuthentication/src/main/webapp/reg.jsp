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
String un = request.getParameter("un");
String pwd = request.getParameter("pwd");	
String add = request.getParameter("add");
String mob= request.getParameter("mob");

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	//out.println("Checkpoint1 Reached");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Surya#589");
	Statement statement = connection.createStatement();
	String query = "Insert into users (`username`, `password`, `address`, `mobile_no`) values (' "+un+" ', ' "+pwd+" ',' "+add+" ',' "+mob+" ' )";
	statement.executeUpdate(query);
	
	response.sendRedirect("regSuccess.html");
	
	
	
}
catch(Exception e){
	System.out.println(e);
}



%>

</body>
</html>