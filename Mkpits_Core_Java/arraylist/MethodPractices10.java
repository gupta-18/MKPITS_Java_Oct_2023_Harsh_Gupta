package com.mkpits.arraylist;

import java.util.ArrayList;

public class MethodPractices10 {

	public static void main(String[] args) {

		 ArrayList<String> sl = new ArrayList<String>();
		 sl.add("batman");
		 sl.add("superman");
		 sl.add("ironman");
		 sl.add("captain");
		 sl.add("spiderman");
		 sl.add("thor");
		System.out.println(sl);
		
		sl.clear(); //clears the whole list
		sl.retainAll(sl);
		System.out.println(sl);
	}

}
