package com.mkpits.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SamikshaTask {

	public static void main(String[] args) {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<String> strObj = new ArrayList<String>();
		List<Integer> intObj = new ArrayList<>();
		
		System.out.println("How many subjects are  there?");
		try {
			int size =Integer.parseInt(br.readLine()) ;
			
			for (int i = 0; i < size; i++) {
				System.out.println("Enter the subject and marks respectively:-");
				String subject = br.readLine();
				int marks = Integer.parseInt(br.readLine());
				strObj.add(subject);
				intObj.add(marks);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		 
			

		Iterator<String>sobj = strObj.iterator();
		Iterator<Integer>iobj = intObj.iterator();
		while (iobj.hasNext()) {
			Integer integer = (Integer) iobj.next();
			String string = sobj.next();
			
			System.out.println(string + ":- "+ integer);

		}
		
	}

}

