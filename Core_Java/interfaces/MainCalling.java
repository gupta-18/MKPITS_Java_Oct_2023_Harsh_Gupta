package com.mkpits.interfaces;

public class MainCalling {

	public static void main(String[] args) {
		Calling obj;
		
		obj = new Calling("harsh");
		obj.getName("gupta");
		obj.getNumber(6576666677l);
		
		System.out.println();
		
		obj= new Calling2("hero");
		obj.getName("hulk");
		obj.getNumber(12);
		
//interface is used for data hiding abstract class ka use kare ya inheritance ka to udhar har chiz me object bananna badta hai
//isse code redundancies or memory space badhegi isliye interface use karte hai isme koi object ya constructor ka kaam nahi hai
		
	}

}
