<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>
</head>
<body>
	<form action="customerlink" method="post">
		<label>ENTER CUSTOMER NAME</label>
		<input type="text" name="customer" /><br><br>
		
		<label>SELECT PRODUCTS</label><br>
		<input type="checkbox" name="products" value="MOBILE" />MOBILE<br><br>
		<input type="checkbox" name="products" value="LAPTOP" />LAPTOP<br><br>
		<input type="checkbox" name="products" value="EARPHONES" />EARPHONES<br><br>
		<input type="checkbox" name="products" value="WATCH" />WATCH<br><br>
		
		
		<input type="submit" value="PLACE ORDER" />
	</form>
</body>
</html>