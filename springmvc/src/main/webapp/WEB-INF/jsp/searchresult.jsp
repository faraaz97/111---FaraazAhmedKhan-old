<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Age</th>
			<th>Salary</th>
			<th>Aadhar</th>
			<th>Department</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${empList}" var="emp">
			<tr>
				<td>${emp.id}</td>
				<td>${emp.empName}</td>
				<td>${emp.age}</td>
				<td>${emp.salary}</td>
				<td>${emp.aadharNumber}</td>
				<td>${emp.department}</td>
				<td><a href = "/employee/update/${emp.id}">Update</a></td>
				<td><a href = "/employee/delete/${emp.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>