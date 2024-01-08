package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhilePractice1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number you want the sum of:- ");
		int num = Integer.parseInt(br.readLine());
		
		int sum =0;
		while(num>0  || sum>10) {
			
			if(num==0) {
				num=sum;
				sum=0;
			}
			sum += num % 10;
			num = num/10;
		
			
			//System.out.println("current sum value :- "+sum +"and  current num value:- "+ num);
		}
		System.out.println(sum);
//		while(sum !=0 ) {
//			sum1 += sum%10;
//			sum /= 10;
//		}
//		System.out.println(sum1);
	}

}
