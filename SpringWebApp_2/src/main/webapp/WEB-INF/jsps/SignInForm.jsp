<html>
	<head>
		<title>Spring Web MVC</title>
	</head>
	<body>
		<h1 style="text-align: center;font-family: verdana;color: green">
			${msg}
		</h1>
		
		<hr/>
		
		<h1>Sign In</h1>
		<form action="signIn" method="post">
			<table>
				<tr>
					<td>User Id : </td>
					<td><input type="text" name="userId"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="pass"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Sign In"/></td>
				</tr>
			</table>
		</form>
		
	</body>
</html>