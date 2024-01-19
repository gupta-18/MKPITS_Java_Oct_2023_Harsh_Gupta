package com.mkpits.arraylist;

import java.util.ArrayList;

public class MethodPractice3IndexOf {

	public static void main(String[] args) {

		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(40);
		al.add(40);
		al.add(50);
		al.add(50);
		al.add(40);
		al.add(30);
		al.add(20);
		System.out.println("list is:- "+ al);
		System.out.println("size of list is "+al.size());
		// use indexOf() to find the first occurrence of an
				// element in the list
		
		int index = al.indexOf(1);
		System.out.println("\nindex of 1 is:- "+ index);
		//it will return -1 cause 1 is not in a list
		
		int index1 = al.indexOf(40);
		System.out.println("\nfirst index of 40 is:- "+ index1);
		//it will return first index of 40
		//indexOf method sees first occurrence of an element
		
		int lastindex = al.lastIndexOf(40);
		System.out.println("\nlast index of 40 is:- "+ lastindex);
		//lastIndexOf method sees last occurrence of an element
		
		System.out.println("\nfirst index of 20 is :- "+ al.indexOf(20));
		System.out.println("last index of 20 is :- "+ al.lastIndexOf(20));
		
		
		
		
	}

}
