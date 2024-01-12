package com.mkpits.enums;

public enum EnumUse {
//      SUNDAY , MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	
	NAME("Harsh"),LASTNAME("Gupta"), FRIENDS("RAJ");
	String var ;

	EnumUse(String string) {
		this.var = string;
	}
	
	//Enum is only used to declare constant values
	//here we can assign values in  parenthesis  and we have to take a variable to print 
	
	
	
}
