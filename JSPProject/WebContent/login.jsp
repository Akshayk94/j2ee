<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN HOME</title>
	<style type="text/css">
		#msg1
		{
			color:white;
			background-color: green;
		}
		
		#msg2
		{
			color:white;
			background-color: red;
		}
	</style>
</head>
<body>
	<h1>LOGIN VALIDATION</h1>
		<%
		String username=request.getParameter("user");
		String password=request.getParameter("password");
		
		if(username.equals("corona") && password.equals("china"))
		{%>
			<h2 id="msg1">LOGIN SUCCESSFUL</h2>
		<%}
		else
		{ %>
			<h2 id="msg2">INVALID LOGIN DETAILS</h2>
		<%}%>
</body>
</html>