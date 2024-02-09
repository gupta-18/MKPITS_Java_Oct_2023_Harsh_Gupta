package com.mkpits.scopeofvariables;

public class StaticDirectCall {

	static String  yourName= "Harsh";
	//here you can only assign the value you cannot print your variable.
	static int age= 34;
	public static void main(String[] args) {
		 System.out.println(yourName);
		
     int age =22;
     System.out.println(age);
	}

}
// we can call static variable by three methods 
//1 directly
//2 using className.variableName     by using this we can call our static variable in different classes also.