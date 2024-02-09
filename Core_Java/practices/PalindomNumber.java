package com.mkpits.practices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//pallindrom number 121,123321 is type kmhote hai jinko rev karne k baad same number print hota hai
//we are taking number as a input
//reversing it using loop
//comparing it if reverse number  is equal to input number and telling it is pallindrom or not
public class PalindomNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number");
		
		int num = Integer.parseInt(br.readLine());

		int temp =num;
		int rev= 0;
		while(temp!=0) {
			int remainder = temp%10;
			rev = rev*10 +remainder; 
			temp /= 10;
		}
			
	String check   =	(num==rev)? "it is palindrom number" : "it is not palindrom number";
	System.out.println(check);
			
		}

	}


