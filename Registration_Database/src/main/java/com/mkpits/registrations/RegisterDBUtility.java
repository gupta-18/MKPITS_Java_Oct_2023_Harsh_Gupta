package com.mkpits.registrations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

public class RegisterDBUtility {

	
	 private DataSource dataSource;
	public RegisterDBUtility(DataSource dataSource) {
		// TODO Auto-generated constructor stub
		this.dataSource =dataSource;
	}
	public void addUser(ModalClass registered) {
		Connection myConn = null;
		PreparedStatement myStmt = null;

		try {
			// get db connection
			myConn = dataSource.getConnection();

			// create sql for insert
			String sql = "insert into userdetails(username,mobile,email,city,gender,password) values(?,?,?,?,?,?)";
			myStmt = myConn.prepareStatement(sql);

			// set the param values for the student
			myStmt.setString(1, registered.getUsername());
			myStmt.setString(2, registered.getMobile());
			myStmt.setString(3, registered.getEmail());
			myStmt.setString(4, registered.getCity());
			myStmt.setString(5, registered.getGender());
			myStmt.setString(6, registered.getPassword());

			// execute SQL insert
			myStmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(myConn, myStmt, null);
		}
		
	}
	private void close(Connection myConn, PreparedStatement myStmt, ResultSet myRs) {
		// TODO Auto-generated method stub
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
	
	

}

