package com.mkpits.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class CallingClass {

	public static void main(String[] args) {

		
		ArrayList<ModalOrBeanClass> arrl = new ArrayList<ModalOrBeanClass>();
		
		arrl.add(new ModalOrBeanClass(1, "Lakhan"));
		arrl.add(new ModalOrBeanClass(2, "Lassan"));
		arrl.add(new ModalOrBeanClass(3, "Chaman"));
		
		System.out.println("this is itorator");

		for (Iterator iterator = arrl.iterator(); iterator.hasNext();) {
			ModalOrBeanClass modalOrBeanClass = (ModalOrBeanClass) iterator.next();
			System.out.println(modalOrBeanClass);
		}
		System.out.println("this is foreach");
		for (ModalOrBeanClass modalOrBeanClass : arrl) {
			System.out.println(modalOrBeanClass);
		}
		
		
		
		
		
	}

}
