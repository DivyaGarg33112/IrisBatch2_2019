<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
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
			<h1>Registration Form</h1>
			<f:form action="registerUser" method="post" modelAttribute="userObj">
			<table>
				<tr>
					<td>User Id : </td>
					<td><f:input path="userId"/></td>
				</tr>
				<tr>
					<td>User Name : </td>
					<td><f:input path="userName"/></td>
				</tr>
				<tr>
					<td>Password : </td>
					<td><f:password path="password"/></td>
				</tr>
				<tr>
					<td>Gender : </td>
					<td><f:input path="gender"/></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit" value="Sign Up"/>
					</td>
				</tr>
			</table>
			</f:form>
		</div>
		
	</body>
</html>