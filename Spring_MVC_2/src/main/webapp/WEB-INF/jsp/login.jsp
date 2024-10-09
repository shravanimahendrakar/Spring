<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
</head>
<body>
 <h2>Welcome, <%= session.getAttribute("loggedInUser") != null ? session.getAttribute("loggedInUser") : "Guest" %></h2>
	<a href="allUser">All registered user</a>
</body>
</html>