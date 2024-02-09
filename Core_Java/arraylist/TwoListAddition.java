package com.mkpits.arraylist;

import java.util.ArrayList;
import java.util.List;

public class TwoListAddition {

	public static void main(String[] args) {
		List<String> sObj = new ArrayList<String>();
		sObj.add("Harsh");
		sObj.add("chamdi");
		sObj.add("Samiksha");
		sObj.add("raj");
		sObj.add("vaibhav");
		
		List<String> s1Obj = new ArrayList<String>();
		s1Obj.add("Shreesir");
		s1Obj.add("Harsh");
		s1Obj.add("Samiksha");
		s1Obj.add("pranav");
		s1Obj.add("sanket");
		
		
		
		sObj.addAll(s1Obj);
		for (String string : sObj) {
			System.out.println(string);
		}
		

System.out.println("retain all");
		
		sObj.retainAll(s1Obj);
		for (String string : sObj) {
			System.out.println(string);
		}
		
		System.out.println("\n\n hiii");

		sObj.removeAll(s1Obj);
		for (String string : sObj) {
			System.out.println(string);
		}
		
		System.out.println(sObj.size());
		
		
		
		
		
	}

}
