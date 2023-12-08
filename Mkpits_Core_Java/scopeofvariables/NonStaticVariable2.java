package com.mkpits.scopeofvariables;

public class NonStaticVariable2 {

	public char character = '@';
	public int  pinCode= 440017;
	public boolean activated= true;
	public long  number= 6394550077l;
	public short rollNumber= 6234;
	public byte  serialNumber= 123;
	public float  sallary= 50000.3333f;
	public double  piValue=3.147689;
	
	public static void main(String[] args) {
		

		
		NonStaticVariable2 variable = new NonStaticVariable2();
		
		NonStaticVariable1 variable1 = new NonStaticVariable1();
		
		
		System.out.println(" Your charcter is :-"+ variable.character);
		System.out.println(" your pincode is :- "+ variable.pinCode);
		System.out.println("your system is activated :-"+ variable.activated);
		System.out.println("your calling number is:-"+ variable.number);
		System.out.println("your rollnumber is:-"+ variable.rollNumber);
		System.out.println("your serialnumber is :-"+ variable.serialNumber);
		System.out.println("your sallary is :-"+ variable.sallary);
		System.out.println("universal value of pi is:-"+ variable.piValue);
		
		System.out.println("these are the default values"+ variable1.NonStaticVarible1 );
	
	}

}
