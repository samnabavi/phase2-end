<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Provide your username and your password to login</h2>
	<form method="post" action="LoginServlet">

		Username:<input type="text" name="eUsername"><br /> 
		Password: <input type="password" name="ePassword"><br /> 
		
		<button type="submit">Login</button>

	</form>
</body>
</html>