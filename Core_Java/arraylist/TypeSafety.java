package com.mkpits.arraylist;

import java.util.ArrayList;

public class TypeSafety {

	public static void main(String[] args) {
//Typesafty means jo data type hai us hisab se hi value insert karna
		
		Integer [] arr = new Integer [10];
		
		arr[0] = 23;
		arr[2] = 243;
		arr[3] = 33;
//		arr[4] = "harsh"; // show compile time error
	
//non generic version
		//isme angle bracket <> ye nhi hota hai
	ArrayList list = new ArrayList();
	list.add(34);
	list.add(34.45f);
	list.add(true);
	list.add("hi world");
	
System.out.println(list.get(3));//directly it will print but while assigning it will ask to typecast
	
//	Integer var = list.get(0);//it will tell u to typecast it
	Integer var =  (Integer) list.get(0); 
	System.out.println(var);
	
//	for (String object : list) {
//		System.out.println(object);
//} it will show error because list is returning only object we cannot hold it in any specific data type
//only object superclass can hold it	
	
	for (Object object : list) {
		System.out.println(object);
	}
	
	
	
	
	
	
	}

}
