package com.mkpits.miniprojects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class RandomValueGenerater {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
 int randomValue = (int)Math.floor(Math.random()*100); 
 System.out.println("You have only 10 attempts\n");
 

 
  for (int i = 1; i <=10; i++) {
	  System.out.println("Enter your number");
	int   userInput = Integer.parseInt(br.readLine());
	  if(randomValue == userInput) {
		  System.out.println("Your value is matched\n");
		  System.out.println("You won");
		  break;
	  }
	  else if(randomValue > userInput) {
		  System.out.println("Input is small number\n"); 
		  System.out.println("You have used "+i+" attempt\n");
		  
		   
	  }
	  else if(randomValue < userInput) {
		  System.out.println("Input is greater number\n");
		  
		  System.out.println("You have used "+i+" attempt\n");
		 
		   }
	  if( i==10) {
		   System.out.println("Out of attempts");
	          }  
      }
}

}
