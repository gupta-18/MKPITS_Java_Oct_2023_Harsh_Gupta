package com.mkpits.enums;

public class EnumInClass {
 public enum  test{
	 FRUIT,FLOWERS,ANIMAL
 }
	
 
	public static void main(String[] args) {
		 for(test string : test.values()) {
			System.out.println(string);
		}
		
	}

}
