<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student App</title>
</head>
<body>
	<!-- FETCH THE DATA FROM MODEL -->
	<% String output=(String)request.getAttribute("message"); %>
	
	<h1>STUDENT CONFIRMATION PAGE</h1>
	
	<h2><%=output %></h2>
</body>
</html>