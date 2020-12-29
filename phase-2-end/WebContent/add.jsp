<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Add your product</h2>
<form method="post" action="ProductServlet">

Name:<input type="text" name="pName"><br/>
id: <input type="text" name="pId"><br/>
color: <input type="text" name="pColor"><br/>
year: <input type="text" name="pYear"><br/>
<button type="submit">Add</button>

</form>

</body>
</html>