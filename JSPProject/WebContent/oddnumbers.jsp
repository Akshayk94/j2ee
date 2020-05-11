<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ODD NUMBERS</title>
</head>
<body>
	<h1>ODD NUMBERS</h1>
	
	<h2>
	<%
		String n1=request.getParameter("lower");
		String n2=request.getParameter("upper");
		
		int no1=Integer.parseInt(n1);
		int no2=Integer.parseInt(n2);
		
		for(int i=no1;i<=no2;i++)
		{
			if(i%2!=0)
			{
				out.print(i+"<br>");
			}
		}
	%></h2>
</body>
</html>