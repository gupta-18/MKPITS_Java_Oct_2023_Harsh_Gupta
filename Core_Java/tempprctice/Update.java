package com.mkpits.tempprctice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		
	try {	
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/mkpits_student","root","");
		PreparedStatement stmt=con.prepareStatement("update student set first_name=? where id=?");  
		stmt.setString(1,"Sonuu");//1 specifies the first parameter in the query i.e. name  
		stmt.setInt(2,6);   
		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated"); 

	} catch(Exception e){ 
		System.out.println(e);
    }

}
}