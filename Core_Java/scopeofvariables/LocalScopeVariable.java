package com.mkpits.scopeofvariables;

public class LocalScopeVariable {
	// if outside main method some variables are declared and we are assigning the variable same name but different value in main method then priority will be in the local scopes.

	static int number =1888;
	
	public static void main(String[] args) {
	
		int number = 1783;
		System.out.println(number);

	}

	
}


// static keyword is used when we want to access any variable within a class,main method or different classes 
//but if when we are declaring static in the local scopes  in main method it cannot be call outside that local scopes





