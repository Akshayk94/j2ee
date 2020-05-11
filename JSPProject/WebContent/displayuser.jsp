<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>USER INFO</title>
</head>
<body>
	<h1>THIS IS DYNAMIC WEB PAGE</h1>
	<h2 style="color:red">Welcome <% 
		String username=request.getParameter("user");
	
		out.print(username);
	%></h2>
	
</body>
</html>