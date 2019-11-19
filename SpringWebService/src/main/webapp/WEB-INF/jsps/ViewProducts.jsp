<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<html>
	<head>
		<title>Spring Web MVC</title>
	</head>
	<body>
		<h1>View Products</h1>
		<table>
			<tr>
				<th>Product Id</th>
				<th>Product Name</th>
				<th>Product Price</th>
			</tr>
			<c:forEach items="${productDetails}" var="pObj">
			<tr>
				<td>${pObj.productId}</td>
				<td>${pObj.productName}</td>
				<td>${pObj.price}</td>
			</tr>
			</c:forEach>
		</table>
	</body>
</html>