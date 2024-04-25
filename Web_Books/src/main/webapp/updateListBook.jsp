<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Book</title>
<!-- <link type="text/css" rel="stylesheet" href="css/styletemp.css"> -->
<link type="text/css" rel="stylesheet" href="css/add-book-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			  <h2 style="text-align: center;"> Book Storage</h2>
			
		</div>
	</div>
	
	<div id="container">
	<h3>Update Book</h3>
	<form action="BooksControllerServlet" method="get">
	<input type="hidden" name="command" value="UPDATE"/>
	<input type="hidden" name="bookId"  value="${THE_BOOK.id}"/>
	
	<table>
	<tbody>
	<tr> 
	<td><label>Title:</label></td>
	<td><input type="text" name="title" value="${THE_BOOK.title}" /></td>
	</tr>
	
	
	<tr> 
	<td><label>Author:</label></td>
	<td><input type="text" name="author" value="${THE_BOOK.author}" /></td>
	</tr>
	
	<tr> 
	<td><label>Date:</label></td>
	<td><input type="text" name="date"  value="${THE_BOOK.date}"/></td>
	</tr>
	
	<tr> 
	<td><label>Genres:</label></td>
	<td><input type="text" name="genres"  value="${THE_BOOK.genres}"/></td>
	</tr>
	
	<tr> 
	<td><label>Characters:</label></td>
	<td><input type="text" name="characters"  value="${THE_BOOK.characters}"/></td>
	</tr>
	
	<tr> 
	<td><label>Synopsis:</label></td>
	<td><input type="text" name="synopsis"  value="${THE_BOOK.synopsis}"/></td>
	</tr>
	
	<tr>
	<td><input type="submit" value="Save" class="save"></td>
	</tr>
	</tbody>
	
	</table>
	</form>
	<div style="clear:both;"></div>
	<p>
	
	<a href="BooksControllerServlet">Back To List</a>
	</p>
	</div>
</body>
</html>