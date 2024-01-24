package com.mkpits.linkedlist;

import java.util.LinkedList;

public class LinkedListPractice7Peek {

	public static void main(String[] args) {

		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(0,1);
		ll.add(1,2);
		ll.add(2,3);
		ll.add(3,4);
		ll.add(4,5);
		ll.add(5,6);
		
	int temp=	ll.peek();
		System.out.println(temp);
		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();

		int temp1= ll1.peek();
		System.out.println(temp1);
		
	}

}
