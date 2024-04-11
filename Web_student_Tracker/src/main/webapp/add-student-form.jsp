<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
<link type="css/text" rel="stylesheet" href="css/style.css">
<link type="css/text" rel="stylesheet" href="css/add-student-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>MKPITS University</h2>
		</div>
	</div>

	<div id="container">
		<h3>Add Student</h3>
		<form action="StudentControllerServletNew" method="get">
			<input type="hidden" name="command" value="ADD" />
			<table>
				<tbody>
					<tr>
						<td><lable>First Name:</lable></td>
						<td><input type="text" name="firstName"/></td>
					</tr>
					
					<tr>
						<td><lable>Last Name:</lable></td>
						<td><input type="text" name="lastName"/></td>
					</tr>
					
					<tr>
						<td><lable>Email:</lable></td>
						<td><input type="text" name="email"/></td>
					</tr>
					
					<tr>
						<td><input type="submit" value="save" class="save"/></td>
					</tr>
					
	      		</tbody>
			</table>
		</form>
	</div>
</body>
</html>