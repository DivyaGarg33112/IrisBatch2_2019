<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	<div align="center">
		<h1>Registration Form</h1>
		<form action="register" method="post">
			<table>
				<tr>
					<td>First Name : </td>
					<td><input type="text" name="firstname"></td>
				</tr>
				<tr>
					<td>Last Name : </td>
					<td><input type="text" name="lastname"></td>
				</tr>
				<tr>
					<td>Gender : </td>
					<td>
					<input type="radio" name="gender" value="m" checked>Male
					<input type="radio" name="gender" value="f">Female
					</td>
				</tr>
				<tr>
					<td>City</td>
					<td>
						<select name="city">
							<option value="none">--Select your City---</option>
							<option value="delhi">Delhi</option>
							<option value="noida">Noida</option>
							<option value="gurugram">Gurugram</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>Password : </td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>Role : </td>
					<td><input type="text" name="role"></td>
				</tr>
				
				<tr>
					<td></td>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>