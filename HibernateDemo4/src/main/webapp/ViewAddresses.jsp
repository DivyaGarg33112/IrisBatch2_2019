<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<div align='center'>
	${msg}
<hr/>
	
	<table border="1">
		<tr>
			<th>Address line 1</th>
			<th>Address line 2</th>
		</tr>
		<c:forEach items="${pObj.addrSet}" var="obj">
			<tr>
				<td>${obj.addressLine1}</td>
				<td>${obj.addressLine2}</td>
			</tr>
		</c:forEach>
	</table>

</div>
</body>
</html>
