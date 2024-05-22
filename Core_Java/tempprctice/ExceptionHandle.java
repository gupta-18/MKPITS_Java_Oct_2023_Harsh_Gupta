package com.mkpits.tempprctice;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ExceptionHandle {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {	
			
			
			try {
				int a= 2/0;
			
		} catch (ArithmeticException e) {
            e.printStackTrace();
			
		}
			System.out.println(" going to divide by zero");
		
		} catch (Exception e) {
			// TODO: handle exception
		}
	

		
	}

}
