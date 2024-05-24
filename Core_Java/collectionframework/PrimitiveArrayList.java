package com.mkpits.collectionframework;

import java.util.ArrayList;

public class PrimitiveArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>(5);
		//size dalke koi matlab nhi hai auto increment kar leta hai wo size ko
		al.add(1);
		al.add(101);
		al.add(201);
		al.add(301);
		al.add(401);
		
		al.add(501);
		al.add(601);
		
		for (Integer integer : al) {
			System.out.println(integer);
		}
		
		
		
		
		
		
	}

}
