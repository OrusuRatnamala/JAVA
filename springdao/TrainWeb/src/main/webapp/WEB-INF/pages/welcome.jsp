<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>train information</title>
<link rel="stylesheet" href="style.css" />
</head>
<body style="background-color: pink;">
	<form action="traindetails" align="center">

		<h2>Enter Details</h2>
		Train Id <input type="number" name="trainno" placeholder="train NO" /><br>
		<br> <input type="submit" value="traindetails" /><br> <br>
		<br> Booking Tickets:
		<button>
			<a href='https://www.irctc.co.in/nget/train-search'>Click Here</a>
		</button>
		</br> </br>
	</form>
	<form action="details" align="center">
		Source:<select name="source">
			<option value="">-Select-</option>
			<option value="kazipet junction">kazipet Junction</option>
			<option value="warangal junction">Warangal junction</option>
			<option value="vijayawada">vijayawada</option>
			<option value="nalgonda">nalgonda</option>
			<option value="kachiguda">Kachiguda</option>
			<option value="Siddipet">Siddipet</option>
			<option value="secunderabad">Secunderabad</option>
		</select><br> <br> Destination:<select name="destination">
			<option value="">-Select-</option>
			<option value="secunderabad">Secunderabad</option>
		</select><br> <br> <input type="submit" value="Get Train Details" />
	</form>
</body>
</html>