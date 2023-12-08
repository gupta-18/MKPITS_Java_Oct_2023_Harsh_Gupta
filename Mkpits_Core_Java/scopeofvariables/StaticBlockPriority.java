package com.mkpits.scopeofvariables;

public class StaticBlockPriority {

	public static void main(String[] args) {
		String myName = "harsh";
		int age =22;
		
	System.out.println("your name:-"+ myName + "  and age is:-"+ age);

	}

	static {
		char gender ='M';
		System.out.println("Your gender is:-"+ gender);
		
	}
	
	
}
  

// here we can see in output that static block have highest priority in the code ...it is called before the main method.
//eg:- when we want that our database may connected to the server before our ui is loading which makes our project fast there static block can be used.