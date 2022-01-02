<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>

</head>
<body>
	
	<form action="/employee/add/" method="POST">
		<p> Name         :<input type="text" name="empName"><br>
		<p> age          :<input type="text" name="age"><br>
		<p> salary       :<input type="text" name="salary"><br>
		<p> aadharNumber :<input type="text" name="aadharNumber"><br>
		<p> department   :<input type="text" name="department"><br>
		
		 <input
			type="submit" value="Save">
	</form>
</body>
</html>