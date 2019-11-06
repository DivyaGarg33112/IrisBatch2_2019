<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="MyError.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EL Demo</title>
</head>
<body>
	<form action="process.jsp">
		Name : <input type="text" name="t1"/><br/>
		
		Qualification: 
			<input type="checkbox" name="qualification" value="Btech" checked>B.Tech
			<input type="checkbox" name="qualification" value="Mtech">M.Tech
			<input type="checkbox" name="qualification" value="BE">BE
			<input type="checkbox" name="qualification" value="BSc">BSc.
		
		<input type="submit"/>
	</form>
</body>
</html>