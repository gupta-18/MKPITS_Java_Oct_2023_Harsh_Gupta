package com.mkpits.arraylist;

import java.util.ArrayList;

public class MethodPractice8Equals {

	public static void main(String[] args) {

		
		ArrayList<String> sl = new ArrayList<String>();
		sl.add("monday");
		sl.add("tuesday");
		sl.add("wednesday");
		sl.add("thursday");
		sl.add("friday"); 
		sl.add("saturday");
		
		boolean istrue = sl.get(0).equals("monday");
		System.out.println(istrue);
		
		boolean isfalse = sl.get(4).equals("monday");
		System.out.println(isfalse);
		
	}

}
