<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="test.Calculator" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String n1=request.getParameter("num1");
		String n2=request.getParameter("num2");
		
		double no1=Double.parseDouble(n1);
		double no2=Double.parseDouble(n2);
	%>
	
	<h2>ADDITION OF TWO NUMBERS IS <%= Calculator.addnumbers(no1,no2) %></h2>
</body>
</html>