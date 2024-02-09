package com.mkpits.exception;

public class TryCatch {

	public static void main(String[] args) {
		int arr[] = new int [5];
		try {
			System.out.println(arr[5]);
		} catch ( ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		
		int x=30,y=0;
		try {
			System.out.println(x/y);
			System.out.println(arr[6]);
			
			
		} catch (ArithmeticException | NumberFormatException e) {
			e.printStackTrace();
			//we can write multiple condition  it will execute till first condition try block arr[6] will not be executed
		}catch ( ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
