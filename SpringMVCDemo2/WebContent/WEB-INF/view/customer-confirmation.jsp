<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Confirmation</title>
</head>
<body>
	<h1>Customer Details:</h1>
	
	<h2>Customer Name is ${custref.customerName}</h2>
	
	<h2>Customer City is ${custref.cityName }</h2>
	
	<h2>Coupon count is ${custref.couponCount}</h2>
	
	<h2>Customer Email id is ${custref.customerEmail }</h2>
	
	<h2>Customer Birth Date is ${custref.birthDate}</h2>
</body>
</html>