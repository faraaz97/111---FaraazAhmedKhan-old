<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>UpdateInfo</title>
</head>


<body>
	<h1>Please Update Info</h1>

	<form action="/employee/update" method="POST">
		<input type=hidden name="Id" value="${id}" />
		<p> ID           :<input type="text" name="id" value = "${id}" disabled><br>
		<p> Name         :<input type="text" name="empName" value = "${name}"><br>
		<p> age          :<input type="text" name="age" value = "${age}"><br>
		<p> salary       :<input type="text" name="salary" value = "${salary}"><br>
		<p> aadharNumber :<input type="text" name="aadharNumber" value = "${aadhar}" ><br>
		<p> department   :<input type="text" name="department" value ="${department}"><br>
		
		 <input
			type="submit" value="Update">
	</form>
</body>
</html>