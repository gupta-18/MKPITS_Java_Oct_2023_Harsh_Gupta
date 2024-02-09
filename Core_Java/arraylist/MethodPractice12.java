package com.mkpits.arraylist;

import java.util.ArrayList;

public class MethodPractice12 {

	public static void main(String[] args) {
		 ArrayList<String> sl = new ArrayList<String>();
		 sl.add("batman");
		 sl.add("superman");
		 sl.add("ironman");
		 sl.add("captain");
		 sl.add("spiderman");
		 sl.add("thor");
		System.out.println(sl);
		
		
		ArrayList<String> sl2 = new ArrayList<String>();
		 sl2.add("superman");
		 sl2.add("batman");
		 sl2.add("ironman");
		 sl2.add("captain");
		 sl2.add("spiderman");
		 sl2.add("thor");
		
		
		sl.clear();
		System.out.println(sl);
		
		

	}

}
