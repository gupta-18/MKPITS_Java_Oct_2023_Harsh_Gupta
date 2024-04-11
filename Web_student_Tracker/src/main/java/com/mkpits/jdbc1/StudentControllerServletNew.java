package com.mkpits.jdbc1;

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
 * Servlet implementation class StudentControllerServlet
 */
@WebServlet("/StudentControllerServletNew")
public class StudentControllerServletNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentControllerServletNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    private StudentDbUtility studentDbUtil;
    @Resource(name = "jdbc/web_student_tracker")
    private DataSource dataSource;
   
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
//create our student db util... and pass in the conn pool/datasource
    	
    	try {
    		studentDbUtil = new StudentDbUtility(dataSource);
    	}
    	catch (Exception exc) {
        throw  new ServletException(exc);		
        }
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		   try {
			   String theCommand = request.getParameter("command");	
			   
			   if (theCommand == null) {
				theCommand = "LIST";
			}
			   
			   switch (theCommand) {
			case "LIST":
				   listStudents(request, response);

				break;
			case "ADD":
				addStudent(request,response);
				break;

			default:
				   listStudents(request, response);
				   
				
			}
		} catch (Exception e) {
			throw new ServletException();
		}
		}
		
	private void addStudent(HttpServletRequest request, HttpServletResponse response) {

		//read student data from form
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		
		//create new student_model object
		
		Student_Model theStudent =new Student_Model(firstName, lastName, email);
		
		//add student to the database
		studentDbUtil.addStudent(theStudent);
		
		
		
	}
	private void listStudents(HttpServletRequest request, HttpServletResponse response) throws Exception {
     // get students from db util
		List<Student_Model> students = studentDbUtil.getStudents();
		
		//add students to the request
		request.setAttribute("STUDENT_LIST", students);
		
		//send to JSP page(view)
		RequestDispatcher dispatcher = request.getRequestDispatcher("/list-student-CSS.jsp");
		dispatcher.forward(request, response);
		
	}

}