<%@page isELIgnored="false" %>
<html>
<body>
<div align='center'>
<h2>Welcome : ${sessionScope.pObj.personName}</h2>
<hr/>

<a href="">View Profile</a>
<a href="Address.jsp">Add Address</a><br/>
<a href="ViewAddresses.jsp">View All Addresses</a><br/>
<a href="AddCategory.jsp">Add Category</a><br/>
<a href="ViewAllCategories">View All Categories</a><br/>
<a href="AddProductForm">Add Product</a><br/>
<a href="ViewAllProducts">View All Products</a><br/>
</div>
</body>
</html>
