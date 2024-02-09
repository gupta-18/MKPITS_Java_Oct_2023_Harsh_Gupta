package com.mkpits.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class MethodPractice9Iterator {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(40);
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(50);
		al.add(90);
		al.add(10);
		al.add(80);
		
		
//listiterator ka use karke reverse kar sakte hai list 
		ListIterator li = al.listIterator() ;
		
		while (li.hasNext()) {
			Object object = (Object) li.next();
			System.out.println(object);
			
		}
		
		
		System.out.println("\n");
		
		
		while (li.hasPrevious()) {
			Object object = (Object) li.previous();
			System.out.println(object);
			
		}
		
		
		
		
	}

}
