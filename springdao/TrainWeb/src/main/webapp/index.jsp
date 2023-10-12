<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Creation</title>
</head>
<body align="center">
	<form action="register" method="post">
		<h1>Welcome To TrainWeb</h1>
		</br>
		<h1>User Registration</h1>
		</br> Full name <input type="text" name="name" /></br> E-mail<input
			type="email" name="email" /></br> Password <input type="password"
			name="password" /></br> Gender <input type="radio" name="gender"
			value="male">Male</input><input type="radio" name="gender"
			value="female">Female</input></br> <input type="submit" value="Register" />

	</form>
	<form action="create">
		Already have an Account ? <input type="submit" value="login" />
	</form>
</body>
</html>

