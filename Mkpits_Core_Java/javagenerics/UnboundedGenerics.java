package com.mkpits.javagenerics;

public class UnboundedGenerics {

	public static  void main(String[] args) {

		Integer[] intArr = { 1,2,3,4,5,6,7,8,9};
		Printing<Integer> intObj = new Printing<>();
		intObj.printArr(intArr);
		
		String[] stringArr = {"Raj","Asik","pranav", "chamdi"};
		Printing<String> stringObj = new Printing<>();
		stringObj.printArr(stringArr);
		
		Double[] doubleArr = {1.1,1.2,1.3,1.4,1.5,1.6,1.7,1.8,1.9};
		Printing<Double> doubleObj = new Printing<Double>();
		doubleObj.printArr(doubleArr);
	}

}
