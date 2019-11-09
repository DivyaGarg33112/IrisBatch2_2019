<%@page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<div align='center'>
<h2>Saving Collections</h2>
<hr/>

<form action="AddProduct" method="post">
	<fieldset>
		<legend>Add Product</legend>
		<table>
			<tr>
				<td>Product Name : </td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>Product Price : </td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td>Product Quantity : </td>
				<td><input type="text" name="quantity"></td>
			</tr>
			<tr>
				<td>Product Description : </td>
				<td><input type="text" name="description"></td>
			</tr>
			<tr>
				<td>Category : </td>
				<td>
				<select name="category">
					<option value="none">---Select Category---</option>
					<c:forEach items="${categories}" var="obj">	
						<option value="${obj.categoryId}">${obj.categoryName}</option>
					</c:forEach>
				</select>
				</td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input type="submit" value="Add Product"/>
					
				</td>
			</tr>
		</table>
	</fieldset>
</form>

</div>
</body>
</html>
