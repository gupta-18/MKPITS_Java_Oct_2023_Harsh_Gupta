package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemoveDoubleChar {
static BufferedReader br ;
	public static void main(String[] args) throws IOException {
		br= new BufferedReader(new InputStreamReader(System.in)); 
		removeCharacter();

	}

	private static void removeCharacter() throws IOException {
		
		System.err.println("Enter name:- ");
		String name = br.readLine();	
		
		 char ch[] = new char [name.length()];
		 
		 for(int i=0;i<name.length();i++) {
			  ch[i] = name.charAt(i);	
			 }
		 
		 System.out.println(ch);
		 
		 for(int i =0;i<ch.length;i++) {	 
			 for(int j =i+1;j<ch.length;j++) {
				 if(name.charAt(i)==name.charAt(j)) {
					 
				 }
			 }
			 
		 }
		 
		}

	
}
