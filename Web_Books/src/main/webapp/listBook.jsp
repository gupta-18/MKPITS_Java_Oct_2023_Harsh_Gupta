<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@page import="java.util.List"%>
<%@page import="com.mkpits.books.BooksModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>BookList</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<%List<BooksModel> theBooks = (List<BooksModel>)request.getAttribute("BOOK_LIST");
 %>
<body>
<div id ="wrapper">
<div id ="header">
<h2>BOOK LIST</h2>
</div>
</div>

<div id="container">
<div id ="content">
<table>
<tr>
<th>Id</th>
<th>Title</th>
<th>Author</th>
<th>Date</th>
<th>Genres</th>
</tr>
 <c:forEach var ="tempBook" items ="${BOOK_LIST}">
    
    <tr>
           <td>${tempBook.id} </td>
                      <td>${tempBook.title} </td>
                      <td>${tempBook.author} </td>
                      <td>${tempBook.date} </td>
                      <td>${tempBook.genres} </td>
           
                   
    </tr>
    </c:forEach>
</table>
</div>
</div>
</body>
</html>