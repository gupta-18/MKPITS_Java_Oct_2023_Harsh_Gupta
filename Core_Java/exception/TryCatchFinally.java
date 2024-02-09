package com.mkpits.exception;

public class TryCatchFinally {

	public static void main(String[] args) {

		int x=20,y=0;
		
		try {
			int z = x/y; 
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}finally {
			System.out.println("Close Everything from finally");
		}
		
	}

}
