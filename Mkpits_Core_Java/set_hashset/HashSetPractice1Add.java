package com.mkpits.set_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice1Add {

	public static void main(String[] args) {

		
		Set<String> setObj = new HashSet<String>();
        setObj.add("Geeks"); 
		setObj.add("For"); 
        setObj.add("Geeks"); 
        setObj.add("Example"); 
        setObj.add("Set");
		
		System.out.println(setObj);
		
		
		
	}

}
