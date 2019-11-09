<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<div align='center'>
	${msg}
<hr/>
	
	<table border="1">
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Description</th>
			<th>Category</th>
		</tr>
		<c:forEach items="${products}" var="obj">
			<tr>
				<td>${obj.productId}</td>
				<td>${obj.productName}</td>
				<td>${obj.price}</td>
				<td>${obj.quantity}</td>
				<td>${obj.description}</td>
				<td>${obj.category.categoryName}</td>
			</tr>
		</c:forEach>
	</table>

</div>
</body>
</html>
