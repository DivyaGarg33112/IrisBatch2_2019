<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EL Demo</title>
</head>
<body>
	
	
	First Name : ${requestScope.fname}<br/>
	Last Name :  ${applicationScope.lname }<br/>
	Designation : ${sessionScope.designation }<br/>
	
	<a href="process3.jsp">Click Here to see Cookies</a>
	
</body>
</html>