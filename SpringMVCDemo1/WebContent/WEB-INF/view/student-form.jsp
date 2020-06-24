<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form</title>
</head>
<body>
	<form action="enrollstudent" method="post">
		<label>ENTER STUDENT NAME</label>
		<input type="text" name="studentname" /><br><br>
		
		<label>ENTER STUDENT PERCENTAGE</label>
		<input type="text" name="percentage" /><br><br>
		
		<input type="submit" value="ENROLL" />
	</form>
</body>
</html>