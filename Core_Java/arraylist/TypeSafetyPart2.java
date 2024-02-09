package com.mkpits.arraylist;

import java.util.ArrayList;

public class TypeSafetyPart2<T> {

	public void print (T [] test) {
		for (T t : test) {
			System.out.println(t);
		}
	}
	
	public static void main(String[] args) {
//iske class bhi <T> type ki hona
		//Generic version with <T> #unbounded type
		//it is #nottypesafe isme koi bhi data jayega
		Integer[] intArr = {1,2,3,4,5};
		String [] strArr = {"harsh","samiksha","raj","ashik"};
		
		TypeSafetyPart2<Integer> intobj = new TypeSafetyPart2<Integer>();
		intobj.print(intArr);
		
		TypeSafetyPart2<String> strobj = new TypeSafetyPart2<String>();
		strobj.print(strArr);
		
		//ek common method hai jisme T type ka data jayega bas method static nhi hona
		//us T k badle koi bhi datatype de sakte hai 
		//it is not bounded for any datatype
	}

}
