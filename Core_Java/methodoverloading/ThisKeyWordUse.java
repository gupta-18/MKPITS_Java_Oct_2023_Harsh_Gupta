package com.mkpits.methodoverloading;

public class ThisKeyWordUse 
{

	 String firstName ,lastName;
	// static int pi=3;
	public static void main(String[] args) 
	{
		ThisKeyWordUse obj = new ThisKeyWordUse( "harsh" , "gupta");

		System.out.println(obj.firstName + "" + obj.lastName);
		
//		System.out.println(obj.firstName);
//		System.out.println(obj.lastName);
		
		obj.assignValue("Ashik", "Kumar");
		System.out.println(obj.firstName);
		System.out.println(obj.lastName);
	
	}
	
	public ThisKeyWordUse(String firstName, String lastName) 
	{
		this.firstName =firstName;
		this.lastName =lastName;
		System.out.println(firstName + "" + lastName);
		
	}
	
	public void assignValue(String firstName , String lastName)
	
	{
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println(firstName);
		System.out.println(lastName);
		
	}


}