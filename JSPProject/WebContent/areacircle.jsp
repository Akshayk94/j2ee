<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%--  FETCH THE VALUE FROM HTML --%>
	<%
		String var1=request.getParameter("radius");
	
		double rad=Double.parseDouble(var1);
		
	%>
	
	<%-- PRINT THE AREA OF CIRLCE --%>
	<h1>AREA OF CIRCLE IS <%=3.14*rad*rad %></h1>
</body>
</html>