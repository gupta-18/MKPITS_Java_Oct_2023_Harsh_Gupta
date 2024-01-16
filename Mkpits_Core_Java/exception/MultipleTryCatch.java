package com.mkpits.exception;

public class MultipleTryCatch {

	public static void main(String[] args) {
     
		int arr[] = new int [5];
		try {
			System.out.println(arr[5]);
		} catch ( ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		int x=20,y=0;
		try {
			System.out.println(x/y);
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("After error it still printing");
		}
		

	}

}
