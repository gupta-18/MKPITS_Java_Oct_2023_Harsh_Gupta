package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquarePattern {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in));
		
		System.out.println("enter the number");
		int num = Integer.parseInt(br.readLine());
		int i;
		
		for ( i= 0; i<num; i++ ) {
			for (int j = 0; j<num; j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

         
		
	}

}
