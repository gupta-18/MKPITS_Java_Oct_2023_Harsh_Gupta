

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
		
		
		Long num1 =67879054l;
		int num2 = num1.intValue();
		System.out.println(num2);
		
		
	Integer i = Integer.valueOf(num);
	int y1 = i.intValue();
	System.out.println(y1);
	System.out.println(i);
	}

}
