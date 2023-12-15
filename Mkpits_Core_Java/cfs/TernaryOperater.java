package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TernaryOperater {
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader	br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("*Program to find greater number*");
		 System.out.println("Enter first number");
		 int first = Integer.parseInt(br.readLine());
		 System.out.println("Enter second number");
		 int second = Integer.parseInt(br.readLine());
		
// it can be use in place of if else to compare number and etc
//condition me  kitna bhi statement dalo bas value boolean  return hona  
		 int print = (first>second)? first : second;
		 System.out.println(print);
		
	}

}
