package com.mkpits.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIntegerPrint {

	public static void main(String[] args) {

		List<Integer> intArr = new ArrayList<Integer>();
		intArr.add(12);
		intArr.add(29);
		intArr.add(66);
		intArr.add(58);
		intArr.add(99);
		intArr.add(43);
		
		
		
//		for (Integer integer : intArr) {
//			System.out.println(integer);
//		}
		
		
		
//		for (int i = 0; i < intArr.size(); i++) {
//			System.out.println(intArr.get(i));
//		}
		
		Iterator<Integer> obj = intArr.iterator();
		while (obj.hasNext()) {
			int integer =  obj.next();
			System.out.println(integer);
		}
		
		}
}
