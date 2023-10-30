<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="org.infinite.pojo.Product"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Main</title>
</head>
<body align="center">
	<center>
		<h3>Welcome to Product Application</h3>
		<table border="1">
			<tr>
				<td>id</td>
				<td>name</td>
				<td>price</td>
				<td>quantity</td>
				<td>total</td>
			</tr>
			<tr>
				<%
					List<Product> msgList = (List<Product>) request.getAttribute("msg");
					if (msgList != null) {
						for (Product msg : msgList) {
				%>
				<td><%=msg.getId()%></td>
				<td><%=msg.getProductName()%></td>
				<td><%=msg.getPrice()%></td>
				<td><%=msg.getQuantity()%></td>
				<td><%=msg.getTotal()%></td>
				<%
					}
					} else {
				%>
				<p>The 'msg' attribute is not set or is empty.</p>
				<%
					}
				%>
			</tr>
		</table>
		<form action="coupon.jsp"></form>
		<input type="text" name="cupon"><input type="submit">
	</center>
</body>
</html>