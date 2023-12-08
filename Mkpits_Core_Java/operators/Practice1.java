package com.mkpits.operators;

public class Practice1 {
 int a = 10;
	public static void main(String[] args) {
     
		Practice1 obj =new Practice1();
//isme directly value access nhi hogi isliye object banana pada kyunki argument me value pass karna tha 
//or main method k bahar hai class me int a =10 is liye object banana pada
		obj.increment(obj.a);
        obj.postincrement(obj.a);
//idhar values hold nahi ho rahi reason being object bana k call kar rahe hai int a ki value eg. obj.a argument me	
	}
	private void postincrement(int a) {
		System.out.println(a++);
		System.out.println(a++);
	}
	private void increment(int a) {
		System.out.println(++a);
		System.out.println(++a);
	}
	//o/p:- 11,12,10,11
	
		
		
//		obj.increment();
//		obj.postincrement();
//	}
//	private void postincrement() {
//		System.out.println(a++);
//		System.out.println(a++);
//	}
//	private void increment() {
//		System.out.println(++a);
//		System.out.println(++a);
//	}
	
	//o/p:- 11 12 12 13
	//sme ye value hold kar raha hai or prnt ho rahi hai values.
}
