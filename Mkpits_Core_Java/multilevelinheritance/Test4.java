package com.mkpits.multilevelinheritance;

public class Test4 extends Test3 {

	
	protected void getAddition()
	{
	 System.out.println("this");
	}
	
	protected void getdetail() 
	{
		super.getAddition();
	}
	
	
}
