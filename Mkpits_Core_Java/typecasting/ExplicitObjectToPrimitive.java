package com.mkpits.typecasting;

public class ExplicitObjectToPrimitive {

	public static void main(String[] args) {
		String num= "676576";
		
		int number = Integer.parseInt(num);
		System.out.println(number);
		
		float number1 =Float.parseFloat(num);
		System.out.println(number1);
		
		long number2 = Long.parseLong(num);
		System.out.println(number2);

		int x=29, y=23;
		
		int op= Integer.compare(x, y);
		System.out.println(op);
		
	}

}
