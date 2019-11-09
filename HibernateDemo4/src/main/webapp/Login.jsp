<%@page isELIgnored="false" %>
<html>
<body>
<div align='center'>
<h2>Saving Collections</h2>
<hr/>

<div style="color:red">${msg}</div>
<form action="login" method="post">
	<fieldset>
		<legend>Add Person</legend>
		<table>
			<tr>
				<td>Person Id : </td>
				<td><input type="text" name="id"></td>
			</tr>
			<tr>
				<td>Person Name : </td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Login"/>
					
				</td>
			</tr>
		</table>
	</fieldset>
</form>

</div>
</body>
</html>
