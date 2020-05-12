<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- JSP DIRECTIVES --%>    
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>FEEDBACK PAGE</title>
<style type="text/css">
	table,td
	{
		border:5px solid green;
		padding:20px;
		border-collapse: collapse;
	}
</style>
</head>
<body>
	<%--  JSP DECLARATION --%>
	<%!
		String name;
		String email;
		String contact;
		String feedback;
	%>
	
	<%-- JSP SCRIPTLET --%>
	<%
		name=request.getParameter("username");
		email=request.getParameter("email");
		contact=request.getParameter("contact");
		feedback=request.getParameter("feedback");
	%>
	
	<%-- JSP EXPRESSION --%>
	
	<table>
		<tr>
			<td>NAME</td>
			<td><%=name %></td>
		</tr>
		<tr>
			<td>EMAIL</td>
			<td><%=email %></td>
		</tr>
		<tr>
			<td>CONTACT</td>
			<td><%=contact %></td>
		</tr>
		<tr>
			<td>FEEDBACK</td>
			<td><%=feedback %></td>
		</tr>
	</table>
	<% Date d1=new Date(); %>
	<h1 style="color:red"><%=d1 %></h1>
</body>
</html>