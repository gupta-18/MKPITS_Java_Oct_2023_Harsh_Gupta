package com.mkpits.javagenerics;

public class Printing<T> {
 public void  printArr(T[] arr) {
	 for (T t : arr) {
		System.out.println("pyari si value "+ t);
	}
 }
}
