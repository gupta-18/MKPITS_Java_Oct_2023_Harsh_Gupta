package com.mkpits.Methods;

public class ReturnTypeWithArgument2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnTypeWithArgument2 obj = new ReturnTypeWithArgument2();	
		
		String data = obj.getDetails( "Harsh" , 6394550077l, 'M');
		System.out.println(data);
	}

	private String getDetails(String name, long number, char ch) {

//		String details = name + number + ch;
// return details;		 
		return name + '\n'+ number + '\n'+ ch;
	}
	
}
