<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<div align="right">
		Welcome ${uObj.firstname} ${uObj.lastname}
	</div>
	<hr/>
	
	<div align="center">
		<h3><a href="viewAllCustomers">View All Customers</a></h3>
		<h3><a href="">View Profile</a></h3>
		<h3><a href="">Change Password</a></h3>
		<h3><a href="">Logout</a></h3>
	</div>
</body>
</html>