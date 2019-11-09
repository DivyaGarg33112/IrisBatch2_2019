<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<div align='center'>
	${msg}
<hr/>
	
	<table border="1">
		<tr>
			<th>Category Id</th>
			<th>Category Name</th>
		</tr>
		<c:forEach items="${categories}" var="obj">
			<tr>
				<td>${obj.categoryId}</td>
				<td>${obj.categoryName}</td>
			</tr>
		</c:forEach>
	</table>

</div>
</body>
</html>
