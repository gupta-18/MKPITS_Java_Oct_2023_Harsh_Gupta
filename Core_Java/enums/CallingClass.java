package com.mkpits.enums;

public class CallingClass {

	public static void main(String[] args) {
		
		for (EnumUse string : EnumUse.values() ) {
			System.out.println(string +":- "+ string.var);
		}

	} 
	//using foreach loop we have to print enum using enum  method values

}
