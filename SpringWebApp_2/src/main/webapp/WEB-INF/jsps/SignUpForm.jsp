<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>Spring Web MVC</title>
		<style>
      .error {
         color: #ff0000;
      }

      .errorblock {
         color: #000;
         background-color: #ffEEEE;
         border: 3px solid #ff0000;
         padding: 8px;
         margin: 16px;
      }
   </style>
	</head>
	<body>
		<h1 style="text-align: center;font-family: verdana;color: green">
			${myData}
		</h1>
		
		<hr/>
		
		<div align="center">
			<h1>${formLabel}</h1>
			
			
			
			<f:form action="${path}/registerUser" method="post" modelAttribute="userObj">
			 <f:errors path = "*" cssClass = "errorblock" element = "div" />
			<table>
				<tr>
					<td>User Id : </td>
					<td>
					<f:input path="userId"/>
					</td>
					<td>
					<f:errors path="userId" cssClass = "error" />
					
					</td>
				</tr>
				<tr>
					<td>User Name : </td>
					<td>
					<f:input path="userName"/>
					</td>
					<td>
						<f:errors path="userName" cssClass = "error" />
					</td>
				</tr>
				
				<c:if test="${userObj.password eq null || empty userObj.password}">
				<tr>
					<td>Password : </td>
					<td>
					<f:password path="password"/>
					<f:errors path="password"/>
					</td>
				</tr>
				</c:if>
				
				
				<tr>
					<td>Gender : </td>
					<td>
					<f:input path="gender"/>
					<f:errors path="gender"/>
					</td>
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