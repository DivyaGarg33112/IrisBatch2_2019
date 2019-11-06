<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="MyError.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EL Demo</title>
</head>
<body>

	<%
	int[] arr=new int[6];
	arr[8]=9;
	%>
	
	Welcome : ${param.t1}<br/>
	
	Qualification : ${paramValues.qualification[7]}<br/>
	<c:forEach items="${paramValues.qualification}" var="i">
		${i}<br/>
	</c:forEach>	
	 
	<a href="click">Click Here</a>
	
	
</body>
</html>