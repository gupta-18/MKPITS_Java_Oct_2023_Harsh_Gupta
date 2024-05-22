package com.mkpits.tempprctice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) {
   try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://Localhost:3306/mkpits_student","root","");
		PreparedStatement stmt=con.prepareStatement("insert into student values(?,?,?,?)");  
		stmt.setInt(1,6);//1 specifies the first parameter in the query  
		stmt.setString(2,"Ratan");  
		stmt.setString(3,"Tata");  
		stmt.setString(4,"Ratan@Tata.com");  
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");   
		  
   }catch(Exception e){ 
			
			System.out.println(e);
			
	}

}
}