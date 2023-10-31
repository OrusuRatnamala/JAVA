<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http//www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AAdhar Request Form</title>
</head>
<body>
	<form method="post" action="aadhar">
		<center>
			<pre>
New Registration:<input type="checkbox" name="newregis" value="new" />
Update Details:<input type="checkbox" name="updetails" value="update" />
<br>
FirstName <input type="text" name="fname" />
LastName <input type="text" name="lname" />
Father Name <input type="text" name="fathername" />
Current Address <input type="textarea" name="caddress" />
Permanent Address <input type="textarea" name="paddress" />
DOB <input type="date" name="doj" />
Contact No <input type="text" name="contactno" />
Addhar No <input type="text" name="aadharno" />
Gender <input type="text" name="Gender" />
OTP <input type="text" disable="true" />
Captcha  <input type="text" name="captcha" />

<input type="submit" /> <input type="reset" />
</pre>
		</center>
	</form>
</body>
</html>