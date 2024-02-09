package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Practice {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("daal");
		
		 String test=br.readLine();
		
		//toarray ek method hai string ki jo chararray me convert karti hai
		
	//	String test1 = "1,2,3,4,5,";
		
		char []arr =  test.toCharArray();
		
		for (char string : arr) {
			System.out.println(string);
		}
		
		
		

	}

}
