package com.mkpits.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MethodPractice5 {

	public static void main(String[] args) {
		// Creating List class object
				List<String> arrList = new ArrayList<>();

				// Adding elements to the object
				// Custom inputs
				arrList.add("Harsh");
				arrList.add("Samiksha");

				// Adding For at 1st indexes
				arrList.add(1, "and");

				// Print the initialArrayList
				System.out.println("ArrayList " + arrList);

				// Now remove element from the above list
				// present at 1st index
				arrList.remove(1);

				// Print the List after removal of element
				System.out.println("After the Index Removal " + arrList);

				// Now remove the current object from the updated
				// List
				arrList.remove("g");

				// Finally print the updated List now
				System.out.println("After the Object Removal " + arrList);
				System.out.println(arrList.size());
	}

}
