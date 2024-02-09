package com.mkpits.exception;



public class MultipleCatches {

	public static void main(String[] args) {
		int arr[]= new int [5];
		try {
			int var = arr[5];
			System.out.println(var);
		}catch (ArithmeticException e) {
	   e.printStackTrace();
	   System.out.println("ArithmaticException");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("ArrayOUTOFBOUND");
		}catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("NumberFormatException");
		}
		

	}

}
