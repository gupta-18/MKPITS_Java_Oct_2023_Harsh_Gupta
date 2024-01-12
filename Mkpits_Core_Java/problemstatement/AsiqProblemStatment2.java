package com.mkpits.problemstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AsiqProblemStatment2 {
//we are taking a String value and our o/p should be if a word have even character length then it will print that word
//for that we are using a split method which will separte every word from its space and storing it in an array
//then we are checking  index  length in if statement.
	public static void main(String[] args) throws IOException {
		System.out.println("Enter your string:- ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name = br.readLine();
		  
		 String temp[] = name.split(" ");
		
		for (int i = 0; i < temp.length; i++) {
			
			if(temp[i].length()%2==0) {
			System.out.println(temp[i]);
			}

			
		}
		
		
		
		
	}

}
