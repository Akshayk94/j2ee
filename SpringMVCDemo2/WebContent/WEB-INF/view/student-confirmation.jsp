<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
	<h1>STUDENT DETAILS</h1>
	
	<h2>STUDENT NAME IS ${stud.studentName} </h2>
	<!-- stud.getStudentName(); -->
	
	<h2>STUDENT PERCENTAGE IS ${stud.studentPercentage}</h2>
	<!-- stud.getStudentPercentage(); -->
	
	<h2>STUDENT STREAM IS ${stud.studentStream}</h2>
	
	<h2>STUDENT COUNTRY IS ${stud.country}</h2>
	
	<h2>STUDENT GENDER IS ${stud.gender}</h2>
	
	<h2>SELECTED COURSE ARE</h2>
	<c:forEach var="temp" items="${stud.courses }">
		<h3>${temp}</h3>
	</c:forEach>
</body>
</html>