<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
<!-- <link type="text/css" rel="stylesheet" href="css/style.css">
 -->
 <link type="text/css" rel="stylesheet" href="css/add-book-style.css">
</head>
<body>
	<div id="wrapper">
		<div id="header">
			 
		</div>
	</div>
	
	<div id="container">
	<h3>Add Book</h3>
	<form action="BooksControllerServlet" method="get">
	<input type="hidden" name="command" value="ADD"/>
	
	<table>
	<tbody>
	<tr> 
	<td><label>Title:</label></td>
	<td><input type="text" name="title" /></td>
	</tr>
	
	
	<tr> 
	<td><label>Author:</label></td>
	<td><input type="text" name="author" /></td>
	</tr>
	
	<tr> 
	<td><label>Date:</label></td>
	<td><input type="text" name="date" /></td>
	</tr>
	
	<tr> 
	<td><label>Genres:</label></td>
	<td><input type="text" name="genres" /></td>
	</tr>
	
	<tr> 
	<td><label>Characters:</label></td>
	<td><input type="text" name="characters" /></td>
	</tr>
	
	<tr> 
	<td><label>Synopsis:</label></td>
	<td><input type="text" name="synopsis" /></td>
	</tr>
	
	<tr>
	<td class="btn"><input  type="submit" value="ADD" class="save"></td>
	</tr>
	</tbody>
	
	</table>
	</form>
	<div style="clear:both;"></div>
	<span class="backlist">
	<a id="backtolist" href="BooksControllerServlet">Back To List</a>
	</span>
	</div>
</body>
</html>