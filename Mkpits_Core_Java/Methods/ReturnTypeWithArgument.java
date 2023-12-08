package com.mkpits.Methods;

public class ReturnTypeWithArgument {

	public static void main(String[] args) {
	
		ReturnTypeWithArgument obj = new ReturnTypeWithArgument();
		 
		// String data =obj.getDetails( 18 , 10000);
		 
		 System.out.println(obj.getDetails( 18 , 10000));

	}

	private double getDetails(int id , int salary) {
		
//		String details = " this is my ID:- "+id +" "+ (salary+salary*0.01);
		return (id + (salary+salary*0.01)); 
		
		
		
		
	}

}
