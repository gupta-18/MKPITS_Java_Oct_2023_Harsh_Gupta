package com.mkpits.arraylist;

import java.util.ArrayList;

public class MethodPractice7Contain {

	public static void main(String[] args) {

		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(23);
		al.add(18);
		al.add(28);
		al.add(98);
		al.add(77);
		
		System.out.println(al.contains(77));
		//contains return boolean value
		boolean result = al.contains(50);
		System.out.println(result);
		
		
	}

}
