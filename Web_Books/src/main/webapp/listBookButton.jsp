<%@page import="com.mkpits.books.BooksModel"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Books Storage</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>
<%
//get the student the requestDispatcher
List<BooksModel> theBooks = (List<BooksModel>) request.getAttribute("BOOK_LIST");
%>
<body>
 <div id="wrapper">
  <div id="header">
  <h2 style="text-align: center;"> Book Storage</h2>
  </div>
  </div>
 
 <div id="container">
 <div id="content">
 <input type="button" value="Add Book" onclick="window.location.href ='addBookForm.jsp; return false'"
   class="add-student-button">
 <table border="1">
 <tr>
         <th>ID</th>
         <th>Title</th>
        <th>Author</th>
        <th>Date</th>
        <th>Genres</th>
        <th>Characters</th>
        <th>Synopsis</th>
        <th>Action</th>
    </tr>
    <c:forEach var ="tempBook" items ="${BOOK_LIST}">
    <!--  Set up link for each student -->
    <c:url var="tempLink"  value="BooksControllerServlet">
    <c:param  name="command" value="LOAD" /> 
    <c:param  name="bookId" value="${tempBook.id}" /> 
    </c:url>
    
    <!--  Set up link for each student -->
    <c:url var="deleteLink"  value="BooksControllerServlet">
    <c:param  name="command" value="DELETE" /> 
    <c:param  name="bookId" value="${tempBook.id}" /> 
    </c:url>
    
    
    
    
    <tr>
           <td>${tempBook.id} </td>
                      <td>${tempBook.title} </td>
                      <td>${tempBook.author} </td>
                      <td>${tempBook.date} </td>
                      <td>${tempBook.genres} </td>
                      <td>${tempBook.characters} </td>
                      <td>${tempBook.synopsis} </td>
                      <td><a href="${tempLink}">Update</a>
                      |<a href="${deleteLink}" onclick="if(!(confirm('Are yousure you want to destroy this row ?'))) return false">Delete</a>
                      </td>
           
                   
    </tr>
    </c:forEach>
    
 </table>
 </div>
 </div>
</body>
</html>