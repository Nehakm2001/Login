<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<form action="/login" method="post">
		<label for="username">Username:</label> <input type="username"
			id="username" name="Username" required><br> <label
			for="password">Password:</label> <input type="password" id="password"
			name="Password" required><br> <input type="submit"
			value="Login">
	</form>
	</center>
</body>
</html>