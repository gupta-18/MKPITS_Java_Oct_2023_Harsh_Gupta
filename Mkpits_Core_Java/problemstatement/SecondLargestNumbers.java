package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondLargestNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       SecondLargestNumbers obj =new SecondLargestNumbers();


       System.out.println("Enter the range of an array:- ");
   int range = Integer.parseInt(br.readLine());
   int arr[] = new int [range];
 
       System.out.println("Enter your array ");
   
		for (int i = 0; i < range; i++) {
			 arr[i] = Integer.parseInt(br.readLine()); 
		}
		
		
     //this method is used to convert the array in ascending order
		obj.ascending(arr);
	//this method is used to remove duplicate number from the array which is converted in ascending order
		obj.duplicateNumber(arr);
		
		

	}
	
	
	void ascending(int arr[]) {
		  int temp;
		  //loop for ascending or descending sequence
		 		for (int i = 0; i < arr.length; i++) {
		 			for (int j = i+1; j < arr.length; j++) {
		 				//<,> can be used for ascending or descending sequence
		 				if(arr[i]<arr[j] ) {
		 				    temp=arr[i];
		 					arr[i] =arr[j];
		 					arr[j]= temp;
		 					}
		 			}
		 		}
	}
	
	
	void duplicateNumber(int arr[]) {
		 int temp1 =0;
			int arr1[] = new int[arr.length];
			
			for (int i = 0; i < arr.length; i++) {
				boolean isTrue = false; 

				for (int j = 0; j < temp1; j++) {
				 
					 if(arr[i]== arr1[j]) {
					   isTrue = true;
					   break;
						}	
				}
				
				if (!isTrue) {
					 arr1[temp1] = arr[i];
					    temp1++;
				}
			}
			
		System.out.println("Our Without duplicate number sequence is :- ");
		for (int i : arr1) {
			if(i != 0) 
			System.out.print(i+" ");
		}
		
		for (int i = 0; i < arr1.length; i++) {
			 if(arr1[i]!=0) {
			System.out.println("\nSecond largest number in given sequence is :- "+arr1[1]);
		}
			 break;
		}
	}

}
