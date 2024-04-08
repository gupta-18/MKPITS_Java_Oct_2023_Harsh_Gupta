<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.mkpits.model.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Data</title>
</head>
<body>
<%
List <Student> data= new ArrayList <Student>();
	data.add(new Student("Vinay","Thaware",false));
	data.add(new Student("Harsh","Gupta",false));
	data.add(new Student("Raj","Warhokar",false));
	data.add(new Student("chamdi","anjankar",false));
	data.add(new Student("samiksha","patil",false));-

pageContext.setAttribute("myStudent",data);
%>

<c:forEach var="tempStudent" items= "${myStudent}">
${tempStudent.firstName}
${tempStudent.lastName}
${tempStudent.premiumUser}
<br>
</c:forEach>
</body>
</html>