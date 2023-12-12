package com.mkpits.typecasting;

public class ExplicitObjToObj {
   String name = "Harsh";
   long mobile;
	public static void main(String[] args) {
		ExplicitObjToObj obj1 = new ExplicitObjToObj();
		ExplicitObjToObj obj2 = new ExplicitObjToObj(6394550077l);
		ExplicitObjToObj obj3 = new ExplicitObjToObj(obj2);
		
		
		obj2.getdata();

	}

	private void getdata() {
		char gender ='M';
	System.out.println(gender);
		
	}

	public ExplicitObjToObj() {
		System.out.println(name);
	}

	public ExplicitObjToObj(long a) {
		mobile = a;
	    System.out.println(mobile);
	}

	public ExplicitObjToObj(ExplicitObjToObj obj2) {
		System.out.println("object to object typecasting");
	}
	  
	
}
