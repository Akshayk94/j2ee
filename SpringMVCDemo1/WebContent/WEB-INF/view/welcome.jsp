<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC App</title>
</head>
<body>
	<% String username=request.getParameter("user"); %>
	
	<h1>THIS IS SPRING MVC APP</h1>
	
	<h2>Welcome <%=username %></h2>
</body>
</html>