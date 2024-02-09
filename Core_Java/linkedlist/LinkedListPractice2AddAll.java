package com.mkpits.linkedlist;

import java.util.LinkedList;

public class LinkedListPractice2AddAll {

	public static void main(String[] args) {

		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(0,1);
		ll.add(1,2);
		ll.add(2,3);
		ll.add(3,4);
		ll.add(4,5);
		ll.add(5,6);
		System.out.println(ll);
		
		LinkedList<Integer> ll2 = new LinkedList<Integer>();
		ll2.add(0,0);
		ll2.add(1,1);
		ll2.add(2,2);
		ll2.add(3,7);
		ll2.add(4,8);
		ll2.add(5,9);
		System.out.println(ll2);
		//This method Inserts all of the elements in the specified collection into this list,
		//starting at the specified position.
		ll.addAll(3, ll2);
		System.out.println(ll);
		
		
		
	}

}
