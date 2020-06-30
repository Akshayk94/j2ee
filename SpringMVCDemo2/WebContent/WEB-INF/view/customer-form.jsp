<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Registration</title>
<style type="text/css">
	.error
	{
		color: red;
	}
</style>
</head>
<body>
	<form:form action="processcustomer" modelAttribute="custref">
		<label>ENTER CUSTOMER NAME</label>
		<form:input path="customerName"/>
		<form:errors path="customerName" cssClass="error"></form:errors><br><br>
		
		<label>ENTER CUSTOMER CITY</label>
		<form:input path="cityName"/>
		<form:errors path="cityName" cssClass="error"></form:errors><br><br>
		
		<label>ENTER COUPON COUNT</label>
		<form:input path="couponCount" />
		<form:errors path="couponCount" cssClass="error"></form:errors><br><br>
		
		<label>ENTER EMAIL ID</label>
		<form:input path="customerEmail"/>
		<form:errors path="customerEmail" cssClass="error"></form:errors><br><br>
		
		<label>ENTER BIRTH DATE</label>
		<form:input path="birthDate" />
		<form:errors path="birthDate" cssClass="error"></form:errors><br><br>
		
		<input type="submit" value="REGISTER" />
	</form:form>
</body>
</html>