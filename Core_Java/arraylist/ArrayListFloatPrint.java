package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListFloatPrint {

	public static void main(String[] args) {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Float> floatArr = new ArrayList<Float>();

    System.out.println("Enter size");
    try {
		int size = Integer.parseInt(br.readLine());
		  for (int i = 0; i < size; i++) {
				System.out.println("Enter the  decimal numbers");
				float input = Float.parseFloat(br.readLine());
				floatArr.add(input);
				
			}
	} catch (NumberFormatException e) {
		System.out.println("NumberFormat needs to checked");
		e.printStackTrace();
	} catch (IOException e) {
        System.out.println("Input needs to be checked");
		e.printStackTrace();
	}
    
    
    
    Iterator<Float> floatobj = floatArr.iterator();
    while (floatobj.hasNext()) {
		Float f =  floatobj.next();
		System.out.println("Your values are "+f);
	}
  
    
    
	}

}
