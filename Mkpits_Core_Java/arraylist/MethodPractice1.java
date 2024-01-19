package com.mkpits.arraylist;

import java.util.ArrayList;
import java.util.StringJoiner;

public class MethodPractice1 {

	public static void main(String[] args) {

		ArrayList<String> sl = new ArrayList<String>();
		
		sl.add("Harsh");
		sl.add("gupta");
		sl.add(1,"@");
		
			System.out.println(sl);
			
			
			StringJoiner sj = new StringJoiner("%");
			sj.add(sl.get(0)).add(sl.get(1));
			
		System.out.println(sj);
		
		
	}		

}
