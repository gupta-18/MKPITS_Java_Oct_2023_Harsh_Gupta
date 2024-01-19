package com.mkpits.arraylist;

import java.util.ArrayList;

public class MethodPractice6Get {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(23);
		al.add(22);
		al.add(45);
		al.add(87);
		al.add(46);
		System.out.println("list is:- "+al);
		
		int first = al.get(0);
		int second = al.get(1);
		int third = al.get(2);
		int fourth = al.get(3);
		int fifth= al.get(4);
		
		System.out.println("\nFirst element is "+ first);
		System.out.println("Second element is "+ second);
		System.out.println("Third element is "+ third);
		System.out.println("Fourth element is "+ fourth);
		System.out.println("Fifth element is "+ fifth);
	}

}
