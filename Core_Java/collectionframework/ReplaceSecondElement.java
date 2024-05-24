package com.mkpits.collectionframework;

import java.util.ArrayList;

public class ReplaceSecondElement {

	public static void main(String[] args) {

		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
				
		al1.add(1);
		al1.add(2);
		al1.add(3);
		//replace second "2" index to 22
	    al1.set(2, 22);
	
	
	for (Integer integer : al1) {
		System.out.println(integer);
	}
		
		
	}

}
