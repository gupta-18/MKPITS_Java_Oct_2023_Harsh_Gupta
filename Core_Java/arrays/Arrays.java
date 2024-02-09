package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Arrays {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  int number[] = {1,2,3,4,5,6,7,};
		  System.out.println(number.length);
		  
		  float []salary = new float [3];
         salary[0]=7.6f;
         salary[1]=2.6f;
         salary[2]=8.6f;
         //salary[3]=6.6f;
         //System.out.println(salary);
// System.out.println(salary[3]); isme array lenth 3 ha main 4 th index ko print kar raha hu to wo error throw karega
	for(int i = 0; i <salary.length;i++) {
		System.out.println(salary[i]);
	}
	
	}

}
