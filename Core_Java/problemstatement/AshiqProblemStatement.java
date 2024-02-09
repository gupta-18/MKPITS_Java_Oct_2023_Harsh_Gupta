package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AshiqProblemStatement {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter how much array u want");
		int user = Integer.parseInt(br.readLine());
		
		int []arr= new int [user];
		
		for (int i = 0; i < user; i++) {
//double valu ko int me convert karna padta hai isliye int use karna hai
		arr[i]= (int)Math.floor(Math.random()*100);
		}
		
	for (int i : arr) {
		System.out.println(i);
	}
		int arr1[]=new int [arr.length];
		int arr2[]=new int [arr.length];
		
		int even=0;
		int odd=0;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]%2==0) {
				 arr1[even++]= arr[i] ;
			}
			else {
				arr2[odd++]= arr[i] ;
			}
		}
		System.out.println("Even values");
		for (int i : arr1) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Odd values");
		for (int i : arr2) {
			System.out.println(i);
		}
		
		int even1=0,odd1=0;
		for (int i = 0; i < arr1.length; i++) {
			 even1 = even1+arr1[i];
			 }
		System.out.println("Addition of even value ="+even1);
		
		for (int i = 0; i < arr2.length; i++) {
			odd1 = odd1+arr2[i];
			}
		System.out.println("Addition of odd value ="+odd1);
		
		
		
		

	}

}
