package com.mkpits.datatypes;

public class LongDataType {

	public static void main(String[] args) {
//		Literal - Integral - byte , int , long , short.
//		default value - 0
//		 Long memory required 8 bytes
		// put L/l after assigning the value
		//the only difference in integral literals are the range of datatypes ...they can be used accordiing to memory requrid and size of the input

		// to calculate the range of datatype use -2^n-1  to  (2^n-1)-1.
		//Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		
		long phoneNumber = 6394550077l;
		long phoneNumber2 = 24335566777L;
		System.out.println("Your  New Phone number is"+ phoneNumber + " and Old number was " + phoneNumber2);

		
	}

}
