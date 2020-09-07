<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="delAthelete">
<table border="1">
<tr>
<td>Enter Athlete Id</td>
<td><input type="text" name="athId"></td>
</tr>
	<tr>
	<td><input type="submit" value="Delete"> <input type="button" value="Cancel" onclick="window.location = 'home';"></td>
	<td><a href="home">Home</a></td>
	</tr>
</table>
</form>
</body>
</html>