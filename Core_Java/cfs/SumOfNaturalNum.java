package com.mkpits.cfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNaturalNum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		int num = Integer.parseInt(br.readLine());
		int i ,sum=1;
		for (i = 1; i<=num; i++) {
	  sum  = sum +i;
		}
System.out.println(sum);
	}

}
