<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1 class="title">
		<i>User Registration </i>
	</h1>
	<hr>
	<form action="registration" method="post">
	<label class="1">Full name:</label>
	<input type="text" placeholder="Full name">
	<br>
	<label>E-mail:</label>
	<input type="text" placeholder="xxxxx@gmail.com" id="Eid">
	<br>
	<label>password:</label>
	<input type="password" name="password" placeholder="password">
	<br>
	<label for="Birtday">Date Of Birtday</label>
	<input type="date" id="Birtday" value="Birtday">
	<br>
	<label>Gender:</label>
	<label>male</label>
	<input type="radio" name="gender" id="male">
	<label>Female</label>
	<input type="radio" name="gender" id="female">
	<br>
	<label>Profession:</label>
	<input list="Profession">
	<datalist id="Profession">
		<option value="Developer">Developer</option>
		<option value="Team Lead">Team Lead</option>
		<option value="manager">manager</option>
	</datalist>
	<br>
	<label>Married?</label>
	<input type="checkbox">
	<br>
	<label>Note:</label>
	<input type="text" placeholder="Note">
	<br>
	<input type="submit" name="button" value="Register">
	<br>
	<br>
	</form>
</body>
</html>
