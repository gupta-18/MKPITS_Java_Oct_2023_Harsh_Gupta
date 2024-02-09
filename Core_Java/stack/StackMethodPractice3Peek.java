package com.mkpits.stack;

import java.util.Stack;

public class StackMethodPractice3Peek {

	public static void main(String[] args) {

		Stack<Integer>sobj= new Stack<Integer>();
		sobj.push(10);
		sobj.push(40);
		sobj.push(50);
		sobj.push(30);
		sobj.push(20);
		sobj.push(60);
		System.out.println(sobj);
		
		System.out.println(sobj.peek());
	
		 System.out.println(sobj);
		// ye bas value dikhata hai 
		 //pop value remove kardeta hai
		
	}

}
