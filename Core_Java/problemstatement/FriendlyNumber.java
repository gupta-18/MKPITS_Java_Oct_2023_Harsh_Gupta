package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FriendlyNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the numbers:- ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		FriendlyNumber obj =new FriendlyNumber();
        obj.CheckFriendlyNum(num1, num2);
//		int sum1 =obj.FriendlyMethod(num1);
//		int sum2 =obj.FriendlyMethod(num2);
//		
//		if (sum1/num1 == sum2/num2) {
//			System.out.println(num1 +" & "+ num2 +" are Friendly numbers");
//		} else {
//			System.out.println(num1 +" & "+ num2 +" are not a Friendly numbers");
//
//		}
		

	}
//this method is not workin its showing not friendly numbers are friendly number
//	int FriendlyMethod( int input) {
//		
//		int sum=0 ;
//		for(int i=1; i <= input; i++) {
//			if (input % i ==0) 
//				sum+=i;
//				
//		}
//		return sum;
//	}
	
	
	
	
	
	
	
	
	
	//this is very rough way to write code 
	void CheckFriendlyNum (int input1 , int input2) {
		int sum = 0 ,temp = 0,sum2 = 0,temp2 = 0;
	//first loop	
		for(int floop =1 ; floop < input1 ; floop++) {
			
			if (input1%floop==0) {
				 sum += floop;
			}
		}
		
		//if ye statement true nhi hui to temp ki value 0 hi rahegi isliye else liya hai
		if (input1==sum) {
			temp = input1/sum;
		}else {
			temp=-1;
		}
		
		
		
	//second loop
        for(int sloop =1 ; sloop < input2 ; sloop++) {
			
			if (input2%sloop==0) {
				 sum2 += sloop;
			}
		}
        
		if (input2==sum2) {
			temp2 = input2/sum2;
		}
		

		//comparison
		if (temp==temp2) {
			System.out.println("Friendly number");
		}
		else {
			System.out.println("Not a friendly number");
		}
		
	}
	}

