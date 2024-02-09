package com.mkpits.linkedlist;

import java.util.LinkedList;

public class LinkedListPractice4Element {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(0,1);
		ll.add(1,2);
		ll.add(2,3);
		ll.add(3,4);
		ll.add(4,5);
		ll.add(5,6);
		//This method gives the head (first element) of this list.
		int temp = ll.element();
		System.out.println(temp);
		System.out.println(ll);
		
		
		
	}

}
