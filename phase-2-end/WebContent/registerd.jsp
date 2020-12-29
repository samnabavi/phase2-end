<%@page import="com.model.Employee"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	session = request.getSession();
	Employee emp = (Employee) session.getAttribute("employeese");

	int id = emp.getId();
	String name = emp.getName();
	String username = emp.getUsername();
	response.getWriter().println("You are successfuly registered!");
	response.getWriter().println("</br>");

	response.getWriter().println("id: " + id + "\n");
	response.getWriter().println("name: " + name + "\n");
	response.getWriter().println("username: " + username + "\n");
	


%>
</br>
<a href="index.jsp">Main Menu</a>
</body>
</html>