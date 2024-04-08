<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>for each</title>
</head>
<body>
<%
String[] cities= {"mumbai","Pune","Nagpur"};
pageContext.setAttribute("mycities", cities);
%>
<c:forEach var="tempCity" items="${mycities}">
${tempCity }<br><br>
</c:forEach>
</body>
</html>