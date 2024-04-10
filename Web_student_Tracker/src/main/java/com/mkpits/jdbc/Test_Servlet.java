package com.mkpits.jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;




/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/Test_Servlet")
public class Test_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//define data source/connection pool for Resources Injection
	@Resource(name="jdbc/web_student_tracker")
	private DataSource dataSource;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//set up printwriter
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//get connection to database
		Connection myConn =null;
		Statement myStmt =null;
		ResultSet myRs =null;
		
		try {
			myConn = dataSource.getConnection();
			
			//create a sql statement
			String sql = "select * from student";
			myStmt = myConn.createStatement();
			
			//execute sql query
			myRs = myStmt.executeQuery(sql);	
			
			//process the result set
			while (myRs.next()) {
				String email = myRs.getString("email");
				out.println(email);
				out.println("<br>");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
