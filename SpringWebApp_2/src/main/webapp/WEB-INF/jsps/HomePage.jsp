<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}" scope="application"/>
<html>
	<head>
		<title>Spring Web MVC</title>
	</head>
	<body>
		<h1 style="text-align: center;font-family: verdana;color: green">
			${myData}
		</h1>
		
		<hr/>
		
		<a href="getSignInForm">Log In</a><br/>
		<a href="getSignUpForm">Sign Up</a><br/>
		
	</body>
</html>