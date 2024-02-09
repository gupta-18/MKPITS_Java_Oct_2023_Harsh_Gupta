package com.mkpits.multilevelinheritance;

public class Test2 extends Test1{
	
	int harsh,samiiiksha;
	
	protected void getAddition() {
//		rollNum = num;
//		this.name= name;
//		
//		System.out.println(rollNum);
//		System.out.println(this.name);
		
		System.out.println("super");
	}
	
	protected void getInformation(int num, String name) {
		rollNum = num;
		this.name= name;
		
		System.out.println(rollNum);
		System.out.println(this.name);
	}
}
