<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addAthelete" method="post">
	<table border="1">
	<tr>
	<td>Athlete Name</td><td><input type="text" name="name"></td>
	</tr>
	<tr>
	<td>Gender</td><td><input type="radio" id="male" name="gender" value="male"> <label for="male">Male</label>   <input type="radio" id="female" name="gender" value="female"> <label for="female">Female</label></td>
	</tr>
	<tr>
	<td>Category</td>
	<td>
	<select name="category" id="category">
	<option value="">Select</option>
  	<option value="Running">Running</option>
  	<option value="High jump">High jump</option>
 	 <option value="Hurdles">Hurdles</option>
 	 <option value="Relay">Relay</option>
 	 <option value="Javelin Throw">Javelin Throw</option>
 	 <option value="Shot put">Shot put</option>
	</select>
	</td>
	</tr>
	<tr>
	<td>Email</td>
	<td><input type="email" name="email"></td>
	</tr>
	<tr>
	<td>Mobile</td><td><input type="tel" name="mobile"></td>
	</tr>
	<tr>
	<td><input type="submit" value="Add"> <input type="button" value="Cancel" onclick="window.location = 'home';"></td>
	<td><a href="home">Home</a></td>
	</tr>
	
	</table>
</form>
</body>
</html>