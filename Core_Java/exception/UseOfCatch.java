package com.mkpits.exception;

public class UseOfCatch {

	public static void main(String[] args) {

		
		try {
	        int x=60,y=0;
	       System.out.println(x/y);
            } catch (Exception e) {
	         System.out.println("Network Error");
            }


		try {
			System.out.println("Hello");
		} finally {
			System.out.println("Hi  there");
		}

	}

}
