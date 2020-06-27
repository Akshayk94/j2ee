<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration</title>
</head>
<body>
	<!-- DYNAMIC SPRING FORM -->
	
	<form:form action="processform" modelAttribute="stud">
	
		<label>ENTER STUDENT NAME</label>
		<form:input path="studentName"/><br><br>
		<!-- stud.setStudentName("text value") -->
		
		<label>ENTER STUDENT PERCENTAGE</label>
		<form:input path="studentPercentage"/><br><br>
		<!-- stud.setStudentPercentage("text value") -->
		
		
		<label>SELECT STUDENT STREAM</label>
		<form:select path="studentStream">
			<form:option value="CS" label="CS"></form:option>
			<form:option value="IT" label="IT"></form:option>
			<form:option value="ETC" label="ETC"></form:option>
		</form:select><br><br>
		
		<label>ENTER STUDENT COUNTRY</label>
		<form:input path="country" /><br><br>
		
		<label>SELECT GENDER</label>
		MALE<form:radiobutton path="gender" value="male"/>
		FEMALE<form:radiobutton path="gender" value="female"/><br><br>
		
		<label>SELECT COURSES</label><br>
		JAVA<form:checkbox path="courses" value="Java"/><br>
		J2EE<form:checkbox path="courses" value="J2ee"/><br>
		WT<form:checkbox path="courses" value="Wt"/><br>
		SPRING<form:checkbox path="courses" value="Spring"/><br>
		
		
		<input type="submit" value="REGISTER">
	</form:form>
</body>
</html>