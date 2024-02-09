package com.mkpits.scopeofvariables;


public class NonStaticVariable1 {
   
	public char character;
	public int  pinCode;
	public boolean activated;
	public long  number;
	public short rollNumber;
	public byte  serialNumber;
	public float  sallary;
	public double  piValue;
	
	
	public static void main(String[] args) {
		
		NonStaticVariable1 variable = new NonStaticVariable1();
		
System.out.println(" Your charcter is :-"+ variable.character);
System.out.println(" your pincode is :- "+ variable.pinCode);
System.out.println("your system is activated :-"+ variable.activated);
System.out.println("your calling number is:-"+ variable.number);
System.out.println("your rollnumber is:-"+ variable.rollNumber);
System.out.println("your serialnumber is :-"+ variable.serialNumber);
System.out.println("your sallary is :-"+ variable.sallary);
System.out.println("universal value of pi is:-"+ variable.piValue);
		
		
	}

}
