package com.mkpits.arraylist;

import java.util.ArrayList;

public class MethodPractice11Trimtosize {

	public static void main(String[] args) {

		
		 ArrayList<String> sl = new ArrayList<String>();
		 sl.add("batman");
		 sl.add("superman");
		 sl.add("ironman");
		 sl.add("captain");
		 sl.add("spiderman");
		 sl.add("thor");
		sl.add(null);
		sl.add(null);
		sl.add(null);
		System.out.println(sl);
		
	sl.trimToSize();
		System.out.print(sl.size());
		
	}

}
