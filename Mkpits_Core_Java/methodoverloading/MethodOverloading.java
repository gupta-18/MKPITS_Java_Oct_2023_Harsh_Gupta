package com.mkpits.methodoverloading;



public class MethodOverloading {

	public MethodOverloading(MethodOverloading obj) {
		System.out.println("parameterized constructor");
	}


	

	public MethodOverloading() {
		 
	}




	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		method();
		obj.method(65);
		System.out.println(obj.method(34, 876.76760f));
		MethodOverloading obj2 = new MethodOverloading(obj);
		System.out.println(obj2.method(265,678.9f, 110l));
		
	}
	
	
	public static void method() {
		String name = "harsh";
		System.out.println(name);
	}
	
	public void method (int num) {
		int localVar = num;
		System.out.println(localVar);
	}

	public int method(int number , float decimal) {
		float combine = number + decimal;
		int combined = (int)combine;
		return combined;
	}
	
	public float method(int number , float decimal,long mobile) {
		
		float add = number+ decimal+mobile;
		return add;
		
	}
	
	
}
