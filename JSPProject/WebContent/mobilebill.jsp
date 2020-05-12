<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="test.BillDetails" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MOBILE BILL</title>
<style type="text/css">
	#output
	{
		font-size: 40px;
		background-color: teal;
		color:white;
	}
</style>
</head>
<body>
	<%
		String price=request.getParameter("price");
		String qty=request.getParameter("qty");
		String os=request.getParameter("os");
		
		double price1=Double.parseDouble(price);
		int qty1=Integer.parseInt(qty);
	%>
	
	<h1>BILL DETAILS ARE</h1>
	<h2>MOBILE PRICE <%=price %></h2>
	<h2>MOBILE QTY <%=qty %></h2>
	<h2>OS TYPE <%=os %></h2>
	<h2 id="output">FINAL BILL AMOUNT IS <%=BillDetails.calculateBill(price1, qty1, os) %></h2>
</body>		
</html>