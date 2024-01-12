package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutomorphicNumber {
//for eg:76 square is 5776  its end digits are 76  numbers like this called auto morphic numbers

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new  BufferedReader(new InputStreamReader(System.in));
		AutomorphicNumber obj = new AutomorphicNumber();
		System.out.println("Enter your number:-");
		int input = Integer.parseInt(br.readLine());
//we are using ternary operator here the boolean  value will be come from the method and it will print the result according to condition 
		String printing = (obj.automorphicNum(input) ? "This number is Automorphic" : "This number is not an Automorphic");
		System.out.println(printing);                        //(true statement)                       (false statement)
		
		
	}
//this method is used to find auto morphic number 
	//first it prints square of the input number
	//then boolean value returns true value if it is auto morphic number
	//otherwise it returns false from if statement
	boolean automorphicNum(int num) {
		int square = num*num;
		System.out.println("Square of given number is:- "+square);
		while (num>0) {
			
			if(num%10 != square%10) {
				return false;
			}
			num/=10;
			square/=10;
		}
		return true;
	}
}
