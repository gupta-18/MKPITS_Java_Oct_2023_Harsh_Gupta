package com.mkpits.arrays;

public class SquareArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,4,3};
		int arrFinal[] = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int temp=  arr[i];
			int square = temp*temp;
			 arrFinal[i] = square;
			
		}
		
for (int i : arrFinal) {
	System.out.println(i);
}

	}

}
