<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Please provide your information</title>
</head>
<body>

<form method="post" action="RegisterServlet">


Id: <input type="number" name="eId"><br/>
Name:<input type="text" name="eName"><br/>
Username: <input type="text" name="eUsername"><br/>
Password: <input type="password" name="ePassword"><br/>
<button type="submit">Register</button>

</form>
</body>
</html>