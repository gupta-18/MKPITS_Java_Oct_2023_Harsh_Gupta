package com.mkpits.interfaces;

public class Calling implements CallToBe {

	
	
    public Calling(String name) {
	System.out.println("constructor calling class me hai but calling 2 se call aa raha hai dada hiding ho rahi hai "+name);
    }
    
    
	@Override
	public void getName(String lname) {
	System.out.println("calling is called"+lname);
	}

	
	@Override
	public void getNumber(long num) {
	System.out.println("calling se number aya"+num);
	}

	
}
