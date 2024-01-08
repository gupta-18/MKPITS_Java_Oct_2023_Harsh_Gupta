package com.mkpits.string;



public class StringDemo {

 String num1,name,name1,name2,name3;
 
  static StringDemo obj;
 
	

	public static void main(String[] args) {
		 obj = new StringDemo();  
		 char [] b= {'a','c','t','r','j','k'}; 
	      int []number = {76,4,55,66,77,67,68};
	     byte []num = {45,34,56,22,45,23,55,22};
	     
		  obj.name ="Harsh Durgesh Gupta";
		 obj.name1 ="Harsh Gupta";
		  obj.name2 ="harsh gupta";
		  obj.num1="45,68,66,67,";
     
		
		//String class ka constructor call kar rahe hai isme
		
		String cons = new String(b);
		System.out.println(cons);
		
		String cons1 = new String(num,0,6);//byte ki value string me dal raha hai isliye ascci val print hogi
		System.out.println(cons1);
		
		String cons2 = new String(b,2,4);
		System.out.println(cons2);
		
		String cons3 =new  String();
		System.out.println(cons3);
		
		obj.callingMethod();
	}



	private void callingMethod() {
		System.out.println(obj.name.charAt(4));
		System.out.println(obj.name.compareTo(obj.name));
		System.out.println(obj.name1.compareToIgnoreCase(obj.name2));
		System.out.println(obj.name2.toLowerCase());
		System.out.println(obj.name2.toUpperCase());
		System.out.println(obj.name.getBytes());
		System.out.println(obj.name.endsWith("a"));
		System.out.println(obj.name2.equals(obj.name1));
		
	}

}
