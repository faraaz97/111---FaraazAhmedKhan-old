                          <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Search</title>
</head>
<body>

	<P>Search the Employee</p>

	<form action="/employee/search/" method="Post">
	Search    : <input type="text" name="search">
	<input
			type="submit" value="search">
	</form>
</body>
</html>