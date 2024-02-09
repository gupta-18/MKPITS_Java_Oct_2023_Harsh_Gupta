package com.mkpits.Methods;

public class StaticMethodCall {

	public static void main(String[] args) {
		//call by className.methodname
		
		System.out.println("This is calling by className.methodName");
		StaticMethod.getFirstName();
		StaticMethod.getLastName();
		StaticMethod.getEmail();
		StaticMethod.getGender();
		StaticMethod.getPassword();
		
		
		// call by objectref.methodname
		System.out.println();
		StaticMethod call = new StaticMethod();
		System.out.println("This is calling by objectref.methodName");
		call.getAllData();
		
		
		
		// calling by instance
		System.out.println("calling by instance");
		new StaticMethod().getEmail();

	}

}
