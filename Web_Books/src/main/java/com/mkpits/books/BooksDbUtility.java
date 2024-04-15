package com.mkpits.books;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;




public class BooksDbUtility {

	
	 private DataSource dataSource;
	  
	  public BooksDbUtility (DataSource dataSource) {
		  
		  this.dataSource = dataSource;
	  }
	  
	  
	  public List<BooksModel>  getBooks() throws Exception {
		  List<BooksModel> books = new ArrayList<>();
		 
		  Connection myConn = null;
		  Statement myStmt = null;
		  ResultSet myRs = null;
		  try {
			  
			  myConn = dataSource.getConnection();
			  
			  //create a sql statement
			  String sql = "Select * from books order by id";
			  myStmt = myConn.createStatement();
			  
			  //execute sql query
			  myRs = myStmt.executeQuery(sql);
			  
			  //process the result set
			  while(myRs.next()) {
				  
				  //retrieve data from result set
				  int id = myRs.getInt("id");
				  String title = myRs.getString("title");
				  String author = myRs.getString("author");
				  String date = myRs.getString("date");
				  String genres = myRs.getString("genres");
				  String characters = myRs.getString("characters");
				  String synopsis = myRs.getString("synopsis");
				  
				  System.out.println(id);

				  
				  //create new student object
				  BooksModel tempBooks = new BooksModel(id, title, author, date, genres, characters, synopsis);
				  
				  //add it to the list of the student
				  books.add(tempBooks);
			  }
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  } finally {
			  close(myConn, myStmt, myRs);
			  
		  }
		  return books;
		  
	  }
	  
	  private void close(Connection myConn, Statement myStmt, ResultSet myRs) {
			try {
				if(myRs != null) {
					myRs.close();
				}
				if(myStmt != null) {
					myStmt.close();
				}
				if(myConn != null) {
					myStmt.close();
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	  public void addBook(BooksModel theBook) {
			Connection myConn = null;
			PreparedStatement myStmt = null;

			try {
				// get db connection
				myConn = dataSource.getConnection();

				// create sql for insert
				String sql = "insert into books (title,author,date,genres,characters,synopsis) values(?,?,?,?,?,?)";
				myStmt = myConn.prepareStatement(sql);

				// set the param values for the student
				myStmt.setString(1, theBook.getTitle());
				myStmt.setString(2, theBook.getAuthor());
				myStmt.setString(3, theBook.getDate());
				myStmt.setString(4, theBook.getGenres());
				myStmt.setString(5, theBook.getCharacters());
				myStmt.setString(6, theBook.getSynopsis());

				// execute SQL insert
				myStmt.execute();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(myConn, myStmt, null);
			}
	      }
	  
	  public BooksModel loadBooks(String theBookId) {
			BooksModel theBook = null;
			Connection myConn = null;
			PreparedStatement myStmt = null;
			ResultSet myRs = null;
			int bookId;

			try {
				// convert book id into integer
				bookId = Integer.parseInt(theBookId);

				// get database connection

				myConn = dataSource.getConnection();

				String sql = "select * from books where id = ?";

				myStmt = myConn.prepareStatement(sql);

				myStmt.setInt(1, bookId);

				// execute statement

				myRs = myStmt.executeQuery();

				// retrive data from result set row

				if (myRs.next()) {
					 String title = myRs.getString("title");
					  String author = myRs.getString("author");
					  String date = myRs.getString("date");
					  String genres = myRs.getString("genres");
					  String characters = myRs.getString("characters");
					  String synopsis = myRs.getString("synopsis");
					  
					theBook = new BooksModel(bookId, title, author, date, genres, characters, synopsis);
				} else {
					throw new Exception("Could not find bookid " + bookId);
				}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				close(myConn, myStmt, myRs);
			}

			return theBook;
		}  
	
	  public void updateBook(BooksModel theBook) throws Exception {

			Connection myConn = null;
			PreparedStatement myStmt = null;
			try {

				// get db connection

				myConn = dataSource.getConnection();

				// create sql to get update student
				String sql = "update books set title = ?, author = ?, date = ?, genres = ? , characters = ?, synopsis = ? where id = ?";

				// create a prepared statement
				myStmt = myConn.prepareStatement(sql);

				// set params
				myStmt.setString(1, theBook.getTitle());
				myStmt.setString(2, theBook.getAuthor());
				myStmt.setString(3, theBook.getDate());
				myStmt.setString(4, theBook.getGenres());
				myStmt.setString(5, theBook.getCharacters());
				myStmt.setString(6, theBook.getSynopsis());
				myStmt.setInt(7, theBook.getId());

				// execute SQL statement
				myStmt.execute();

			} finally {
				close(myConn, myStmt, null);
			}

		}

	  public void deleteBook(String bookId) throws Exception {
			Connection myConn = null;
			PreparedStatement myStmt = null;
			try {
				// convert student to integer
				int theBookId = Integer.parseInt(bookId);

				// get db connection

				myConn = dataSource.getConnection();

				// create sql to get update student
				String sql = "delete from books where id = ?";

				// create a prepared statement
				myStmt = myConn.prepareStatement(sql);
				
				//set params
				myStmt.setInt(1, theBookId);
				
				//execute sql
				myStmt.execute();
			} finally {
				close(myConn, myStmt, null);
			}

		}
	  
}
