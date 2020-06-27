<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
	<form action="employeelink" method="post">
		<label>ENTER EMPLOYEE NAME</label>
		<input type="text" name="empname" /><br><br>
		
		<label>ENTER EMPLOYEE SALARY</label>
		<input type="text" name="salary" /><br><br>
		
		<input type="submit" value="REGISTER" />
	</form>
</body>
</html>