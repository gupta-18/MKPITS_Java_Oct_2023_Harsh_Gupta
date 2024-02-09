package com.mkpits.interfaces;

public class Calling2 extends Calling {
   public Calling2(String name) {
		super(name);
		
	}

long rollnumber;
	@Override
	public void getNumber(long number) {
		this.rollnumber= number;
		System.out.println("calling2 se rollnumber aya"+rollnumber);
		
	}

	@Override
	public void getName(String lname) {
	System.out.println("calling2 is called"+ lname);
		
	}

}
