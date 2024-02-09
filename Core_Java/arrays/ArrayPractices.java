package com.mkpits.arrays;

import java.util.Arrays;

public class ArrayPractices {

	public static void main(String[] args) {
		
//		String []name= {"samiksha","harsh","gupta","gati sir","pranav","shrikant sir","chamdi","vaibhav","raj","ambani","bambani"};
//		
//		System.out.println(name.length);
//		//for each loop sirf array ko print karne k liye use karte hai
//		// isse hum input nahi le sakte user se
//		for (String nam : name) {
//			System.out.println(nam);
//		}
		
		System.out.println("\n");
		
		
//		String names[] =  new String [8];
//		
//	System.arraycopy(name, 1, names, 0, 8);
//	
//	for (String n : names) {
//		System.out.println(n);
//	}
		
		int num[]= {1,2,3,4,5,6,7,8,9};
		
	String str =Arrays.toString(num);
		System.out.println(str);
		
		
	StringBuffer obj = new StringBuffer(str);
		System.out.println(obj.reverse());
	String obj2 =	 new String(obj);
		System.out.println(obj2.replace('[',' '));
		
//		String str1 =new String(obj);
//		System.out.println(str1);
		
	}

}

