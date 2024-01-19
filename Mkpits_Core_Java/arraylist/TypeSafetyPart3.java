package com.mkpits.arraylist;

import java.util.ArrayList;

public class TypeSafetyPart3 {

	public static void main(String[] args) {
//Generic with typesafty  with <> type
// angle bracket me datatype dalenge but only Wrapperclass

	
	ArrayList<Integer> intList = new ArrayList<Integer>();
	intList.add(2);
	intList.add(4);
//	intList.add(2.4);
//	intList.add(true);
//	intList.add("hi world");
	//it will show error only Integer type data is allowed
	
//#typesafe kar diya hai list ko sirf ek hi type ka data ayega
	intList.add(6);
	intList.add(7);
	intList.add(8);
	intList.add(9);
	
	System.out.println(intList.get(4));
	
int var = intList.get(3);
	//here no need to typecast because Integer type ka hi data ayega
//dusre type ka data aa nhi sakta isliye koi typecasting nhi 	
	
	
for (Integer integer : intList) {
	System.out.println(integer);
}

// yaha return object hi hota hai but same type ka data hai isliye 
//hum Integer wrapper class me hold kar sakte hai

//but nongeneric me alag alag type ka data insert kar rahe thhe
//isliye sirf Object superclass hi hold karsakti thi or type cast bhi karna pad raha tha


	}

}
