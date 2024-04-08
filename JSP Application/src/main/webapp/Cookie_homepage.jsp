<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<h3>Training</h3>
<!-- read favrt lang from cookie -->
<%
/* the default----- if there are no cookies*/
 String favLanguage = "Java";
//get cookie from the browser
Cookie[] theCookies = request.getCookies();
//find favrt lang cookie
if(theCookies != null){
	for(Cookie tempCookie: theCookies){
		if("myApp.favoriteLanguage".equals(tempCookie.getName())){
			favLanguage = tempCookie.getValue();
			break;
		}
	}
}
 
 %>
 
 <!-- Now show a personalise page--- use the "favlang variable"
 Show new books for language -->
 <h4>Hot Jobs for
 <%=favLanguage%></h4>
 
 <ul>
 <li>Hello there</li>
 <li>Hello there</li>
 <li>Hello there</li>
 <li>Hello there</li>
 </ul>
 <h4>Hot Jobs for
 <%=favLanguage%></h4>
 
 <ul>
 <li>Hello there</li>
 <li>Hello there</li>
 <li>Hello there</li>
 <li>Hello there</li>
 </ul>
 <h4>Hot Jobs for
 <%=favLanguage%></h4>
 
 <ul>
 <li>Hello there</li>
 <li>Hello there</li>
 <li>Hello there</li>
 <li>Hello there</li>
 </ul>
 <h4>Hot Jobs for
 <%=favLanguage%></h4>
 
 <ul>
 <li>Hello there</li>
 <li>Hello there</li>
 <li>Hello there</li>
 <li>Hello there</li>
 </ul>
 <a href=" cookie_pesonalise_form.html">Personalise this page</a>
</body>
</html>