package com.mkpits.tempprctice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) {

		
		
		
		try {
	          Class.forName("com.mysql.cj.jdbc.Driver");
	          Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/mkpits_student","root","");
	          PreparedStatement stmt=con.prepareStatement("delete from student where id=?");  
	          stmt.setInt(1,6);  
	            
	          int i=stmt.executeUpdate();  
	          System.out.println(i+" records deleted");  
	          
     } catch (Exception e) {
 		System.out.println(e);      
     }
		
		
	}
}
