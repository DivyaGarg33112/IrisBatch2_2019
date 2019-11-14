<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Spring Web MVC</title>
	</head>
	<body>
		<h1 style="text-align: center;font-family: verdana;color: green">
			${myData}
		</h1>
		
		<hr/>
		
		<div align="center">
			<h1>${formLabel}</h1>
			
			
			
			<f:form action="${path}/registerUser" method="post" modelAttribute="userObj">
			<table>
				<tr>
					<td>User Id : </td>
					<td><f:input path="userId"/></td>
				</tr>
				<tr>
					<td>User Name : </td>
					<td><f:input path="userName"/></td>
				</tr>
				
				<c:if test="${userObj.password eq null}">
				<tr>
					<td>Password : </td>
					<td><f:password path="password"/></td>
				</tr>
				</c:if>
				
				
				<tr>
					<td>Gender : </td>
					<td><f:input path="gender"/></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit" value="${btnLabel}"/>
					</td>
				</tr>
			</table>
			</f:form>
		</div>
		
	</body>
</html>