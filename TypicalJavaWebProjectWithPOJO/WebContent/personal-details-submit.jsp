<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Personal Details Submission page</h2>
	<form action="PersonalDetailsSubmitServlet" method="post">
		Name: 
		<input type="text" name="name">
		<br>
		Age:
		<input type="text" name="age">
		<br>
		Gender:
		<input type="text" name="gender">
		<br>
		Mobile:
		<input type="text" name="mobile">
		<br>
		Email:
		<input type="text" name="email">
		<br>
		<input type="submit" value="Submit">
		<br>
	</form> 

</body>
</html>