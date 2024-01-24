package com.mkpits.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SteTreeDemo {

	public static void main(String[] args) {
		
		//Settree jo hai directly alfabetical order k hisab se print karta hai
		
		// Creating a Set object and declaring it of String type 
        // with reference to TreeSet 
        Set<String> ts = new TreeSet<String>(); 
        Set<Integer> ti = new TreeSet<Integer>(); 
  
        // Adding elements into the TreeSet 
        // using add() 
        ts.add("India"); 
        ts.add("Pakistan"); 
        ts.add("America"); 
        ts.add("Bhutan"); 
        ts.add("Canda"); 
        ts.add("Australia"); 
        ts.add("South Africa"); 
  
        ti.add(4);
        ti.add(7);
        ti.add(9);
        ti.add(9);
        ti.add(2);
        ti.add(1);
        ti.add(1);
        ti.add(6);
        
        ti.forEach(System.out::println);
        
        
        // Adding the duplicate 
        // element 
        ts.add("India"); 
  
        // Displaying the TreeSet 
        System.out.println(ts); 
  
        // Removing items from TreeSet 
        // using remove() 
        ts.remove("Australia"); 
        System.out.println("Set after removing "
                           + "Australia:" + ts); 
  
        // Iterating over Tree set items 
        System.out.println("Iterating over set:"); 
        Iterator<String> i = ts.iterator(); 
  
        while (i.hasNext()) {
            System.out.println(i.next()); 
	}
        }

}
