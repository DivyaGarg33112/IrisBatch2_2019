<%@page isELIgnored="false" %>
<html>
<body>
<div align='center'>
<h2>Saving Collections</h2>
<hr/>

<div style="color:red">${msg}</div>
<form action="addAddress" method="post">
	<fieldset>
		<legend>Add Person Address</legend>
		<table>
			<tr>
				<td>Address Line 1 : </td>
				<td><input type="text" name="addr1"></td>
			</tr>
			<tr>
				<td>Address Line 2 : </td>
				<td><input type="text" name="addr2"></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Add Address"/>
					
				</td>
			</tr>
		</table>
	</fieldset>
</form>

</div>
</body>
</html>
