<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="js" value="${pageContext.request.contextPath}/resources/js" scope="application"/>

<html>
	<head>
		<title>Spring Web MVC</title>
	
	</head>
	<body>
		<h1 style="text-align: center;font-family: verdana;color: green">
			${myData}
		</h1>
		
		<hr/>
		
		<a href="addProductForm">Add Product</a><br/>
		<a href="viewAllProducts">View All Products</a><br/>
		
	</body>
</html>