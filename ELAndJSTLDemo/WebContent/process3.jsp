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
	
	
	<c:set var="age" value="29" scope="page"/>
	
	Qualification : ${cookie.qualification.value}<br/>
	Age :  ${pageScope.age}<br/>
	Accept Encoding :- ${header["Accept-Encoding"]}<br/>
	Host :- ${header["host"]}<br/>
	Accept-Language: :- ${header["Accept-Language"]}<br/>
	Method : ${pageContext.request.method } 
	
	<c:choose>
		<c:when test="${age ge 18}">	
		You are eligible for marriage
		</c:when>
		<c:otherwise>
		You are nt eligible for marriage . Pls wait...
		</c:otherwise>
	</c:choose>
	 
	 
	
</body>
</html>