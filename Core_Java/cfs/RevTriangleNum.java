package com.mkpits.cfs;

public class RevTriangleNum {

	public static void main(String[] args) {
		int row = 5;
		for(int i=row;i>=1;i--) {
			for(int k=i;k<=row;k++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
