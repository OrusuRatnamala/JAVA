<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%-- <%-- <html>
<body>
	<h2>Hello World!</h2>
	<form action="hello">

		Username:<input type="text" name="name" /><br> password:<input
			type="password" name="pass" /><br> <input type="submit"
			name="submit">
	</form>
</body>
</html> --%>
--%>

<div align="center">
	<h2>Spring MVC Login Form</h2>
	<table border="0" width="30%">
		<form:form action="login" commandName="userForm">
			<tr>
				<td align="left" width="20%">Email-Id</td>
				<td align="left" width="20%"><form:input path="email" size="30" /></td>

			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" size="30" /></td>

			</tr>
			<tr>
				<td></td>
				<td align="center"><input type="submit" value="Login" /></td>
				<td></td>
			</tr>
		</form:form>

	</table>
</div>

