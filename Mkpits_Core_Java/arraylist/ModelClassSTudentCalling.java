package com.mkpits.arraylist;

import java.util.ArrayList;

public class ModelClassSTudentCalling {

	public static void main(String[] args) {

		ArrayList<ModelClassStudent> list1 = new ArrayList<ModelClassStudent>();
		list1.add(new ModelClassStudent(75, "Hindi"));
		list1.add(new ModelClassStudent(90, "Science"));
		list1.add(new ModelClassStudent(99, "English"));
		
		
		for (ModelClassStudent modelClassStudent : list1) {
			System.out.println(modelClassStudent);
		}
		
		
		
		ArrayList<ModelClassStudent>list2 = new ArrayList<ModelClassStudent>();
		list2.add(new ModelClassStudent(75, "Hindi"));
		list2.add(new ModelClassStudent(70, "Marathi"));
		list2.add(new ModelClassStudent(85, "Maths"));
		
		for (ModelClassStudent modelClassStudent : list2) {
			System.out.println(modelClassStudent);
		}
		
		System.out.println("\n\n");

		list1.addAll(list2);
		for (ModelClassStudent modelClassStudent : list1) {
			System.out.println(modelClassStudent);
		}
		
		System.out.println("\n\n");
		//hashcode or equal method lagane k daad ye compare karke hindi ki dono list value show karega
		list1.retainAll(list2);
		for (ModelClassStudent modelClassStudent : list1) {
			System.out.println(modelClassStudent);
		}
		
		
		
		
		
	}

}
