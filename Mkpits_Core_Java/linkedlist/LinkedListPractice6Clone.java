package com.mkpits.linkedlist;

import java.util.LinkedList;

public class LinkedListPractice6Clone {

	public static void main(String[] args) {

		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(0,1);
		ll.add(1,2);
		ll.add(2,3);
		ll.add(3,4);
		ll.add(4,5);
		ll.add(5,6);
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		
		//This method returns a shallow copy of this LinkedList.
		//we have to type cast it to clone it.
		ll1 = (LinkedList) ll.clone();
		System.out.println("after cloning:- "+ll1);
		
		
	}

}
