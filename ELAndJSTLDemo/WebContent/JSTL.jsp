<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="MyError.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>

<c:set var="salary" value="30000" scope="session"/>

Name = <c:out value="Divya Garg"/><br/>
Salary = ${salary} <br/>
Salary = <c:out value="${salary}"/><br/>
Annual Salary = <c:out value="${12*salary}"/><br/>

<c:remove var="salary" scope="session"/>
Salary Again= <c:out value="${salary}"  default="Not Specified"/><br/>

<c:set var="name" value="${param.t1}"/>
<c:if test="${name ne  'Shubhangi'}">
	Hello ${name}
</c:if>

<br/>

<c:choose>
<c:when test="${not empty param.t1}">
	Hi .. Data found in request parameter..
</c:when>
<c:otherwise>
	Hi.. Data not foud in request parameter..
</c:otherwise>
</c:choose>

<%
	int i=20/0;
%>

<br/>

</body>
</html>












