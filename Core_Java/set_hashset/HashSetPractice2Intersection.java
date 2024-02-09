package com.mkpits.set_hashset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;



public class HashSetPractice2Intersection {

	  public static void main(String args[]) 
	    { 
	        // Creating an object of Set class  
	        // Declaring object of Integer type  
	        Set<Integer> a = new HashSet<Integer>(); 
	        
	        // Adding all elements to List  
	        a.addAll(Arrays.asList( 
	            new Integer[] { 1, 3, 2, 4, 8, 9, 0 })); 
	        
	      // Again declaring object of Set class 
	      // with reference to HashSet 
	        Set<Integer> b = new HashSet<Integer>(); 
	          
	      b.addAll(Arrays.asList( 
	            new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 })); 
	  
	          
	     
	  
	        // To find intersection 
	        Set<Integer> intersection = new HashSet<Integer>(a); 
	        intersection.retainAll(b); 
	        System.out.print("Intersection of the two Set"); 
	        System.out.println(intersection); 
	  
	    } 
}
