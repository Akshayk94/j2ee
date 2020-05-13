<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BILL CALCULATION</title>
<style type="text/css">
	
	#amt
	{
		border:5px solid teal;
		color:white;
		background-color: teal;
		padding: 20px;
	}
	
</style>
</head>
<body>
	<%-- FETCH THE VALUES FROM CONTROLLER --%>
	<%
		double basicamount=(double)request.getAttribute("fairamount");
		int waitingamount=(int)request.getAttribute("waitingcharge");
	%>
	
	<h1>BASIC FAIR AMOUNT <%=basicamount %> Rs</h1>
	
	<h1>WAITING CHARGES <%=waitingamount %> Rs</h1>
	
	<h1 id="amt">TOTAL AMOUNT <%=basicamount+waitingamount %> Rs</h1>
</body>	
</html>