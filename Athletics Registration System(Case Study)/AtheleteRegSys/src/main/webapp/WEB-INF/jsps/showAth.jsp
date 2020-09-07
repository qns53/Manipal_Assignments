<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
	<tr>
		<th>Athlete Id </th>
		<th>Athlete Name </th>
		<th>Gender </th>
		<th>Category </th>
		<th>Email </th>
		<th>Mobile </th>
	</tr>
	<c:forEach var="ath" items="${list}">
	<tr>
		<td>${ath.id} </td>
		<td>${ath.name} </td>
		<td>${ath.gender} </td>
		<td>${ath.category} </td>
		<td>${ath.email} </td>
		<td>${ath.mobile} </td>
	</tr>	

	</c:forEach>
</table>
</body>
</html>