package com.mkpits.linkedlist;

import java.util.LinkedList;

public class LinkedListOPractice3AddFL {

	public static void main(String[] args) {

		
		LinkedList<String> ll = new LinkedList<String>();
		//This method Inserts the specified element at the beginning of this list.
		ll.addFirst("Harsh's");
		ll.add("last name is");
		//This method Appends the specified element to the end of this list.
		ll.addLast("gupta");
		System.out.println(ll);
		
		
//This method returns a string containing all of the elements in this list in proper sequence (from first to the last element),
//each element is separated by commas and the String is enclosed in square brackets.
		String temp = ll.toString();
		System.out.println(temp);
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(0,1);
		ll1.add(1,2);
		ll1.add(2,3);
		ll1.add(3,4);
		ll1.add(4,5);
		ll1.add(5,6);
		
		
		String temp2 = ll1.toString();
		System.out.println(temp2);
		
		
	}

}
