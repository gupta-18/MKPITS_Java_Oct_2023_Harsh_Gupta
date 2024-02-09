package com.mkpits.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDoublePrint {

	public static void main (String args[]) {
		
		List<Double> doubleArr = new ArrayList<Double>();
		doubleArr.add(23.2);
		doubleArr.add(23.5);
		doubleArr.add(23.3);
		doubleArr.add(23.8);
		doubleArr.add(23.9);
		
		
		Iterator<Double>obj = doubleArr.iterator();
		while (obj.hasNext()) {
			Double double1 = (Double) obj.next();
			System.out.println(double1);
		}
	}
	
}
