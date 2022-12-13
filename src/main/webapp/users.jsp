<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
	import="by.epam.jwd.jwd_hw16_webapp01.bean.User"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USERS</title>
</head>
<body>

	<% 
		User user = (User)request.getAttribute("user");
	%>
	
	<h1><b>User's data</b>:</h1>
	
	<p><b>Name</b>: ${user.firstName}</p>
	<p><b>Last name</b>: ${user.lastName}</p>
	<p><b>Age</b>: ${user.age}</p>
	<p><b>Country</b>: ${user.country}</p>
	
	<p><b>Languages</b>: </p>
	<c:forEach var="lang" items="${user.languages}">
		<ul>
			<li>${lang}</li>
		</ul>
	</c:forEach>

</body>
</html>