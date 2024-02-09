package com.mkpits.operators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Practice2 {

	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter The Number");
		int input = Integer.parseInt(br.readLine());
		
		while (input > 0) {
			if(input > 0 && input <=12) {
				System.out.println("*");
//				input--;
				
			}
			else if (input >12 && input <=24) {
				System.out.println("**");
//				input--;
			}
			else if (input > 24 && input <=30) {
				System.out.println("***");
				input--;
			}
			
		}

	}

}
