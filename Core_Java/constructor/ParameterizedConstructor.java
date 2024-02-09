package com.mkpits.constructor;

public class ParameterizedConstructor {
 
 String name ="5";
	public static void main(String[] args) {
		
    ParameterizedConstructor obj = new ParameterizedConstructor("Harsh");
    ParameterizedConstructor obj1 = new ParameterizedConstructor(6394550077l);
    ParameterizedConstructor obj2 = new ParameterizedConstructor(obj1);
    ParameterizedConstructor obj3 = new ParameterizedConstructor(76);
    
    		}
	
	public ParameterizedConstructor(String a) {
		name=a;
		System.out.println(a);
	}
	
	public ParameterizedConstructor(long l) {
		System.out.println(l);
	}

	public ParameterizedConstructor(ParameterizedConstructor o) {
		//o hi  use karna padega
	 String  s = o.name;
	 System.out.println(s);
	 
	 
	}
	
	public ParameterizedConstructor(int a) {
		System.out.println(a);
		
	}
		
	//if once a constructor is made then we cannot make same construtor
	//eg:- public ParameterizedConstructor(int a) {
	           //System.out.println(a); if i will try to make same int a in parameter or int bjh it will 
	//show error kyunki same type ka datatype nahi use kar sakte
	
}
	
	
	


