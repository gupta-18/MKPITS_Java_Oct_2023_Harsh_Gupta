<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cookie response</title>
</head>
<body>
<%
String favLang = request.getParameter("favouriteLanguage");

//create cookie
Cookie thecookie = new Cookie("myApp.favoriteLanguage", favLang);
//set life span
thecookie.setMaxAge(60*60*24*365);//for a year
//send cookie to the browser
response.addCookie(thecookie);
%>

Thank You! we set your favourite Language to : ${param.favouriteLanguage}
<br><br> 
<a href ="Cookie_homepage.jsp">Your personalised page</a>
</body>
</html>