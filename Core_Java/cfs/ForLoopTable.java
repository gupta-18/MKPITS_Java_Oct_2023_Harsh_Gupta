package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoopTable {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your number ");
		int num = Integer.parseInt(br.readLine());
		int table ,i;
		for (  i = 1; i<=10; i++) {
			
			table = num*i;
			System.out.println( num +"*"+i+"="+table);
		}
		

	}

}
