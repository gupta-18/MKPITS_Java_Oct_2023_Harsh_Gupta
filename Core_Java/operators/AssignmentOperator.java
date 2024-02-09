package com.mkpits.operators;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		AssignmentOperator obj = new AssignmentOperator();
		obj.addition(3, 4);
		obj.subtraction(50, 20);
		obj.division(40, 4);
		obj.multiplication(4, 4);

	}

	
	private void division(int i, int j) {
		System.out.println(i/=j);	//i/=j => i=i/j
	}

	private void multiplication(int i, int j) {
		System.out.println(i*=j); //i*=j => i=i*j
	}

	private void subtraction(int i, int j) {
	System.out.println(i-=j); //i-=j => i=i-j
		
	}

	private int addition(int num1, int  num2) {
		int answer = num1 += num2;        //i+=j => i=i+j
		System.out.println(answer);
		return answer;
	}
}
