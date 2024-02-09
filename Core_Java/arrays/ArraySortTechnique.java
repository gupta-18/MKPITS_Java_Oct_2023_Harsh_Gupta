package com.mkpits.arrays;

public class ArraySortTechnique {

	public static void main(String[] args) {
		int num[] = {5,8,6,4,2,3,1,0,7,9};
		
		int  [] copyTo = java.util.Arrays.copyOfRange(num, 1, 6);
		for (int i : copyTo) {
			System.out.println(i);
		}
		
		
		

	}

}
