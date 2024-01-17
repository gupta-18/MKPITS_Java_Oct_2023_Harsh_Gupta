package com.mkpits.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListStringPrint {

	public static void main(String[] args) {
  
		List<String> stringArr  = new ArrayList<String>();
		stringArr.add("Harsh");
		stringArr.add("Samiksha");
		stringArr.add("Raj");
		stringArr.add("Vaibhav");
		stringArr.add("Pranav");
		stringArr.add("Chamdi");
		stringArr.add("Ashik");
		stringArr.add("Vinay");
		
		
//		for (String string : StringArr) {
//			System.out.println(string);
//		}
		
//		for (int i = 0; i < stringArr.size(); i++) {
//			System.out.println(stringArr.get(i));
//			
//		}
		
		Iterator<String> obj = stringArr.iterator();
		while (obj.hasNext()) {
			String name = obj.next();
			System.out.println(name);
			
		}
		
	}

}
