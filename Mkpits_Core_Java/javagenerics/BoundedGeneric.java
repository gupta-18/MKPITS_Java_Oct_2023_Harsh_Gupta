package com.mkpits.javagenerics;

public class BoundedGeneric {

	public static void main(String[] args) {
Double [] doubleArr = {1.1,1.2,1.3,1.4,1.5};
PrintingBounded<Double> doubleObj = new PrintingBounded<Double>();
doubleObj.print(doubleArr);

Integer [] intArr = {1,2,3,4,5};
PrintingBounded<Integer> intObj = new PrintingBounded<Integer>();
intObj.print(intArr);

//T extends number class thats why we cannot print string values here

//String []strArr = {"harsh","raj","samiksha"};
//PrintingBounded<String> strObj = new PrintingBounded<String>();
//strObj.print(strArr);
		
	}

}
