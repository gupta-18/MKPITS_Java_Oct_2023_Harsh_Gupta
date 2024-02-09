package com.mkpits.methodoverriding;

public class Calling {

	public static void main(String[] args) {
		
		Rectangle obj;
		
		obj = new Rectangle() ;
		
		obj.getData(7, 5);
		obj.getArea();
		
		obj= new Triangle();
		//implementation hiding bolte hai isko isme apan sub class ka construter use karke same name or parameter wali ethod ko call karke
		//usekarenge but compiler suggest apneko rectangle wali method kar raha hai but call sub class wali method hogi.
		//isko bolte hai implementation hiding and isme overriding ho rahi hai
		obj.getArea();

	}

}
//