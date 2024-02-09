package com.mkpits.javagenerics;

public class PrintingBounded <T extends Number> {
 
	public void print(T[] arr) {
	 
		double sum =0 ;
		for (T t : arr) {
			sum += t.doubleValue();
		}
		System.out.println("Sum = "+ sum);
 }
}
