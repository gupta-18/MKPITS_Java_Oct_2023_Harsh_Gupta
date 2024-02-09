package com.mkpits.linkedlist;

import java.util.LinkedList;

public class LinkedListPractice5GetFL {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(0,1);
		ll.add(1,2);
		ll.add(2,3);
		ll.add(3,4);
		ll.add(4,5);
		ll.add(5,6);
		//This method returns the first element in this list.
		int temp1 = ll.getFirst();
		System.out.println(temp1);
		System.out.println(ll);
		//This method returns the last element in this list.
		int temp2 = ll.getLast();
		System.out.println(temp2);
		System.out.println(ll);
	}

}
