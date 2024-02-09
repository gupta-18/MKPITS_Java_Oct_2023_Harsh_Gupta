package com.mkpits.stack;

import java.util.Arrays;
import java.util.Stack;

public class StackMethodPractice5ToArray {

	public static void main(String[] args) {

		
		Stack<Integer>sobj= new Stack<Integer>();
		sobj.push(10);
		sobj.push(40);
		sobj.push(50);
		sobj.push(30); 
		sobj.push(20);
		sobj.push(60);
		System.out.println(sobj);
		//aisa banega array
		
		String arr ;
		arr=Arrays.toString(sobj.toArray());
		System.out.println(arr);
		
		System.out.println(Arrays.toString(sobj.toArray()));
		
		
	}

}
