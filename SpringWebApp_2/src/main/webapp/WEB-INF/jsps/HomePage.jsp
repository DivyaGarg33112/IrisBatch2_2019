<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}" scope="application"/>
<c:set var="images" value="${pageContext.request.contextPath}/resources/images" scope="application"/>
<c:set var="css" value="${pageContext.request.contextPath}/resources/css" scope="application"/>


<html>
	<head>
		<title>Spring Web MVC</title>
		<link href="${css}/sample.css" rel="stylesheet">
	</head>
	<body>
		<h1 style="text-align: center;font-family: verdana;color: green">
			${myData}
		</h1>
		
		<hr/>
		
		<img src="${images}/logo.png" id="logo">
		<a href="getSignInForm">Log In</a><br/>
		<a href="getSignUpForm">Sign Up</a><br/>
		
	</body>
</html>