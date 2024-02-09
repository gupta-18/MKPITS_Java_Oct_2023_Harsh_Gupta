package com.mkpits.operators;

public class ArithmaticOperator {

	public static void main(String[] args) {
	
		ArithmaticOperator obj = new ArithmaticOperator();
		
		obj.addition(20,30);
        obj.subtraction(23,21);
        obj.multiplication(3,5);
        obj.division(40,4);
        obj.modulo(40,4);  //it means remainder of 40 divided by 4 which is 0
        obj.modulo(4,40);  //it means remainder of 4 divided by 40 which is 4
	}

	private void modulo(int i, int j) {
	  System.out.println(i%j);
		
	}

	private void division(int i, int j) {
		System.out.println(i/j);	
	}

	private void multiplication(int i, int j) {
		System.out.println(i*j);
	}

	private void subtraction(int i, int j) {
	System.out.println(i-j);
		
	}

	private int addition(int num1, int  num2) {
		int answer = num1 + num2;
		System.out.println(answer);
		return answer;
	}

}
