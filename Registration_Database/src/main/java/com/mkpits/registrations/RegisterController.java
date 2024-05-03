package com.mkpits.registrations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private RegisterDBUtility registerDBUtil;
	@Resource(name="jdbc/registrationdatabase")
	private DataSource dataSource;
   
	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			registerDBUtil= new RegisterDBUtility(dataSource);
		} catch (Exception e) {
			throw new ServletException(e);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		addUser(request,response);	
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//for login
		
		try {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/registrationdatabase","root","");
			String n=request.getParameter("email").trim();
			String p=request.getParameter("password");
			PreparedStatement ps=conn.prepareStatement("select email from userdetails where email=? and password=?");
			ps.setString(1, n);
			ps.setString(2, p);
			ResultSet rs= ps.executeQuery();
			if(rs.next()) {
				
				
				  RequestDispatcher rd=request.getRequestDispatcher("home.html");
				  rd.forward(request, response);
				 
			}else {
				
				 out.println("alert('This is an alert message');");
					/*
					 * RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
					 * rd.forward(request, response);
					 */
				 
				
			}
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}


	private void addUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("name");
		 String mobile = request.getParameter("mobile");
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		  String gender = request.getParameter("gender");
		  String password = request.getParameter("password");

		  ModalClass registered = new ModalClass(username, mobile, email, city, gender, password);
		
		  registerDBUtil.addUser(registered);
		  
		  RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
		   dispatcher.forward(request, response);
	}
	
}
