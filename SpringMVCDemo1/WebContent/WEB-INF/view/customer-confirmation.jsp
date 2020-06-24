<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
	<% 
		String customer=(String)request.getAttribute("customername"); 
		String[] productlist=(String[])request.getAttribute("products");
	%>
	
	<h1>CUSTOMER CONFIRMATION PAGE</h1>
	<hr>
	<h2><%=customer %> YOUR ORDER IS CONFIRMED</h2>
	
	<h2>SELECTED PRODUCTS ARE</h2>
	<h2>
	<%
		for(int i=0;i<productlist.length;i++)
		{
			out.print(productlist[i]+"<br>");
		}
	%>
	</h2>
	
</body>
</html>