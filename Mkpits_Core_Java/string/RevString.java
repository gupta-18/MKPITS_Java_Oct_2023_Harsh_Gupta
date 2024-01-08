package com.mkpits.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RevString {

	public static void main(String[] args) throws IOException {
	//String  name = ("Harsh Gupta");
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter reverse statment");
	 String name = br.readLine();	
	char ch []= new char [name.length()];
	
   for(int i =0; i < name.length();i++) {
	   ch[i] =name.charAt(i);
	   System.out.print(ch[i]);
   }
   
   System.out.println();
   
   for(int i = ch.length-1;i>=0;i--) {
	   System.out.print(ch[i]);
   }

	}

}
