package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	char ch = 'y';
	while (ch=='y') {
		System.out.println("Enter Number");
		int n =Integer.parseInt(br.readLine());
		int fact =1;
		for(int i =n;i>=1;i-- ) {
//		for(int i =1;i<=n;i++ ) {
			 fact = (fact *i);
			 }
		System.out.println(fact);	
		System.out.println(" press y to continue");
		ch = (char) br.read();
		br.readLine();
	}	
	}

}
