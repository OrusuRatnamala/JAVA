<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<style>
.blue-button {
	background: #25A6E1;
	filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',
		endColorstr='#188BC0', GradientType=0);
	padding: 3px 5px;
	color: #fff;
	font-family: 'Helvetica Neue', sans-serif;
	font-size: 12px;
	border-radius: 2px;
	-moz-border-radius: 2px;
	-webkit-border-radius: 4px;
	border: 1px solid #1A87B9
}

table {
	font-family: "Helvetica Neue", Helvetica, sans-serif;
	width: 50%;
}

th {
	background: SteelBlue;
	color: white;
}

td, th {
	border: 1px solid gray;
	width: 25%;
	text-align: left;
	padding: 5px 10px;
}
</style>
</head>
<body>
	<form:form method="post" modelAttribute="municipal"
		action="${pageContext.request.contextPath}/addComplains">
		<table>
			<tr>
				<td colspan="2">Add Municipal Complain</td>
			</tr>
			<tr>
				<form:hidden path="id" />
				<td><form:label path="name">Full Name:</form:label></td>
				<td><form:input path="name" size="30" maxlength="30"></form:input>
				</td>
			</tr>
			<tr>
				<td><form:label path="date">Date:</form:label></td>
				<td><form:input path="date" size="30" maxlength="30"></form:input>
				</td>
			</tr>
			<tr>
				<td><form:label path="address">Address:</form:label></td>
				<td><form:input path="address" size="50" maxlength="50"></form:input>
				</td>
			</tr>
			<tr>
				<td><form:label path="modile">Modile Number:</form:label></td>
				<td><form:input path="modile" size="10" maxlength="10"></form:input>
				</td>
			</tr>
			<tr>
				<td><form:label path="email">Email:</form:label></td>
				<td><form:input path="email" size="30" maxlength="30"></form:input>
				</td>
			</tr>
			<tr>
				<td><form:label path="Complain">Complain Type:</form:label></td>
				<td><form:input path="Complain" size="30" maxlength="30"></form:input>
				</td>
			</tr>
			<tr>
				<td><form:label path="wardnum">Ward Number:</form:label></td>
				<td><form:input path="wardnum" size="30" maxlength="30"></form:input>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" class="blue-button" /></td>
			</tr>
		</table>
	</form:form>
	</br>
	<h3>Customer List</h3>
	<c:if test="${!empty listOfComplains}">
		<table class="tg">
			<tr>
				<th width="80">Id</th>
				<th width="120">Full Name</th>
				<th width="120">Date</th>
				<th width="100">Address</th>
				<th width="120">Email</th>
				<th width="100">Phone Number</th>
				<th width="150">Complain</th>
				<th width="100">Ward Number</th>
				<th width="60">Edit</th>
				<th width="60">Delete</th>
			</tr>
			<c:forEach items="${listOfComplains}" var="complainr">
				<tr>
					<td>${complainr.id}</td>
					<td>${complainr.name}</td>
					<td>${complainr.date}</td>
					<td>${complainr.address}</td>
					<td>${complainr.email}</td>
					<td>${complainr.modile}</td>
					<td>${complainr.complain}</td>
					<td>${complainr.wardnum}</td>
					<td><a
						href="<c:url value='/updateComplains/${complainr.id}' />">Edit</a></td>
					<td><a
						href="<c:url value='/deleteComplains/${complainr.id}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>