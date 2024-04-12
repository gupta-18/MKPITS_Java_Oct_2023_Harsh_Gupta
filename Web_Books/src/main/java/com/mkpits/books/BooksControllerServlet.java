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
			listBooks(request, response);
		} catch (Exception e) {
			// TODO: handle exception
			
			throw new ServletException(e);
			}
		}
	
	private void listBooks(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		 List<BooksModel> books = booksDbUtil.getBooks();
		   
		   request.setAttribute("BOOK_LIST", books);
		   
		   RequestDispatcher dispatcher = request.getRequestDispatcher("/listBook.jsp");
		   dispatcher.forward(request, response);
			}


}
