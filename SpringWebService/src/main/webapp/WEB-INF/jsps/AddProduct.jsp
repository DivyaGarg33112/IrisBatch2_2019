<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
	<head>
		<title>Spring Web MVC</title>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
		<script src="${js}/addProduct.js"></script>
		<script src="${js}/CheckName.js"></script>				
	</head>
	<body>
		<h1>Add Product</h1>
		<f:form action="addProduct" method="post" modelAttribute="productObj" id="proForm">
			<table>
				<tr>
					<td>Product Name : </td>
					<td>
						<f:input path="productName" id="pName" />
						<div id="msg" style="color:red;font-style:italic;"></div>
					</td>
				</tr>
				<tr>
					<td>Product Price : </td>
					<td>
						<f:input path="price" id="price"/>
					</td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit" value="Add Product" id="addPro">
					</td>
				</tr>
			</table>
		</f:form>
		
		
	</body>
</html>