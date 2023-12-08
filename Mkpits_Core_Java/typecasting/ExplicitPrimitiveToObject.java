package com.mkpits.typecasting;

public class ExplicitPrimitiveToObject {

	public static void main(String[] args) {
	
		int num = 39;
		Integer nember = new Integer(num);
		System.out.println(nember);
		
		Float number = new Float(num);
		System.out.println(number);
		
		
	//	String name = "harsh";
		int a = 27;
	//	String name1 = new String(a);//its showing error kyunki String khud ek class hai uski wrapper class nhi hai
		//int,float,longetc ke liye koi predefine constructor nhi hai 
		//System.out.println(name1);
		
	}

}
