package com.mkpits.books;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;



/**
 * Servlet implementation class BooksControllerServlet
 */
@WebServlet("/BooksControllerServlet")
public class BooksControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	
	 private BooksDbUtility booksDbUtil;
	    @Resource(name = "jdbc/web_student_tracker")
	    private DataSource dataSource;
	    
	    
	    @Override
	    public void init() throws ServletException {
	    	// TODO Auto-generated method stub
	    	super.init();
	//create our booksdb util... and pass in the conn pool/datasource
	    	
	    	try {
	    		booksDbUtil = new BooksDbUtility(dataSource);
	    	}
	    	catch (Exception exc) {
	        throw  new ServletException(exc);		
	        }
	    }
	
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			//read the "command" parameter
			String theCommand = request.getParameter("command");
			
			//if the command is missing, then default to listing student
			
			if(theCommand == null) {
				theCommand = "LIST";
			}
			
			//route to the appropriate method
			switch (theCommand) {
			case "LIST" : 
				listBooks(request,response);
				break;
			case "RECORDS" : 
				listRecords(request,response);
				break;
			case "ADD" :
				addBook(request,response);
				break;
			case "LOAD" :
				loadBook(request,response);
				break;
			case "UPDATE" :
				updateBook(request,response);
				break;
			case "DELETE" :
				deleteBook(request,response);
				break;
			default:
				listBooks(request,response);
			}
			
		}catch(Exception e) {
			throw new ServletException();
		}

		}
	private void listRecords(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		String spageid = request.getParameter("page");
		int pageid = Integer.parseInt(spageid);
		int total = 100;
		if (pageid == 1) {
		} else {
			pageid = pageid - 1;
			pageid = pageid * total + 1;
		}
		List<BooksModel> books = booksDbUtil.getBooks(pageid, total);
		// add student to the request
		request.setAttribute("BOOK_LIST", books);
		// send to JSP page view
		RequestDispatcher dispatcher = request.getRequestDispatcher("/listBookButton.jsp");
		dispatcher.forward(request, response);

	}		
	



	private void deleteBook(HttpServletRequest request, HttpServletResponse response)throws Exception {

		// read student id from form data
		String bookId = request.getParameter("bookId");
		
		//delete student from database
		booksDbUtil.deleteBook(bookId);
		
		//send back to again "list-student.jsp"
		listBooks(request, response);
	}
	
	private void updateBook(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// read student id from form data
		String bookId = request.getParameter("bookId");
		int id = Integer.parseInt(bookId);

		// read student data from form
		 String title = request.getParameter("title");
		  String author = request.getParameter("author");
		  String date = request.getParameter("date");
		  String genres = request.getParameter("genres");
		  String characters = request.getParameter("characters");
		  String synopsis = request.getParameter("synopsis");

		// create a new student object
		BooksModel theBook = new BooksModel(id, title, author, date, genres, characters, synopsis);

		// perform update on deatabase
		booksDbUtil.updateBook(theBook);

		// send them back to the list "list-students" page
		listBooks(request, response);
	}
	private void loadBook(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//read student id from form data
		String theBookId = request.getParameter("bookId");
		//get student from database (dbUtility)
		BooksModel theBook = booksDbUtil.loadBooks(theBookId);
		//place student in the request attribute
		
		request.setAttribute("THE_BOOK", theBook);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/updateListBook.jsp");
		dispatcher.forward(request, response);
		
		
		}
	private void addBook(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// read student data from form
		String title = request.getParameter("title");
		  String author = request.getParameter("author");
		  String date = request.getParameter("date");
		  String genres = request.getParameter("genres");
		  String characters = request.getParameter("characters");
		  String synopsis = request.getParameter("synopsis");


		// create new Student_Model object
		BooksModel theBook = new BooksModel(title, author, date, genres, characters, synopsis);

		//// add student to the database
		booksDbUtil.addBook(theBook);

		// send back to main page (the student list)
		listBooks(request, response);

	}
	
	private void listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		 List<BooksModel> books = booksDbUtil.getBooks();
		   
		   request.setAttribute("BOOK_LIST", books);
		   
		   RequestDispatcher dispatcher = request.getRequestDispatcher("/listBookButton.jsp");
		   dispatcher.forward(request, response);
			}


}
