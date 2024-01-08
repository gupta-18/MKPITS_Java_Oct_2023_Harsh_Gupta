package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDimensionArray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int array[][]= {{1,2,3},{4,5,6},{7,8,5}};
		//System.out.println(array[2][1]);
		
		for(int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
		
		
//        System.out.println("enter value of array");
//		
//		int number[][] = new int [4][6];
//		
//		
//		for(int i =0;i<4;i++) {
//			for(int j=0;j<6;j++) {
//				number[i][j] = Integer.parseInt(br.readLine());
//			}	
//		}
//		 System.out.println();
//		 
//		for(int i =0;i<4;i++) {
//			for(int j=0;j<6;j++) {
//                  System.out.print(number[i][j]);
//			}	
//			System.out.println();
//		}
	
	
	}

}
