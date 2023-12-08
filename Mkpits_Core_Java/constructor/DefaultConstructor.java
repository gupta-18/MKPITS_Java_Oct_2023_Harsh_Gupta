package com.mkpits.constructor;

public class DefaultConstructor {

	public static void main(String[] args) {
		DefaultConstructor obj = new DefaultConstructor();
		System.out.println(obj);
		//it is a default constructor  which is given by compiler  
		//whenever the constructor is made manually  compiler stops suggesting default

	}
	
	public DefaultConstructor() {
		System.out.println("harsh Gupta");
	}

}
