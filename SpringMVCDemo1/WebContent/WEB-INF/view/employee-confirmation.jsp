<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<%
		String welcomemsg=(String)request.getAttribute("msg1");
	
		String salarymsg=(String)request.getAttribute("msg2");
	%>
	
	<h1>EMPLOYEE DETAILS</h1>
	
	<h2><%=welcomemsg %></h2>
	
	<h2><%=salarymsg %></h2>
</body>
</html>