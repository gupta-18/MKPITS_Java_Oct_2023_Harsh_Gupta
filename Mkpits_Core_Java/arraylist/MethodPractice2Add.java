package com.mkpits.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MethodPractice2Add {

	public static void main(String[] args) {

		List<Integer> list = new  ArrayList<Integer>();
		
		list.add(0, 21);
		list.add(1, 29);
		list.add(2, 22);
		System.out.println("\nlist:- "+list);
		
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		list2.add(28);
		list2.add(25);
		list2.add(23);
		System.out.println("list2:- "+ list2);
		
		
		list.addAll(list2);
		System.out.println("\nafter adding:-"+list);
		
		list.remove(2);
		System.out.println("\nafter removing  index 2 :- " + list);
		
		list.set(2, 30);
		System.out.println("\nafter setting 30 at 2nd index :-" + list);
		
		
	}

}
