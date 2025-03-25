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
String nm = request.getParameter("nm");
String add = request.getParameter("add");
String mob= request.getParameter("mob");

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	//out.println("Checkpoint1 Reached");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Surya#589");
	Statement statement = connection.createStatement();
	String query = "INSERT INTO `registrations` ( `name`, `add`, `mob`) VALUES ('nm', 'add', 'mob')"; 
	
	
}
catch(Exception e){
	System.out.println(e);
}





%>

</body>
</html>