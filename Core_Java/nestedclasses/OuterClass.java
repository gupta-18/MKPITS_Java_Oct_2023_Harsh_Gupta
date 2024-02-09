package com.mkpits.nestedclasses;

public class OuterClass {
	int  x=10;
       
	
	public class InnerClass{
		int y =10;
		int z = x+y;
	}
	
	public class OuterInnerClass{
		void getMethod() {
			System.out.println("Method is called ");
		}
	}
	
	
}
