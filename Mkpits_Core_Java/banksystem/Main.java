package com.mkpits.banksystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main extends BankMethodWritting {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        Main obj = new Main();
  
  System.out.println("Welcome to Sabka sapna money money bank");
  char yes = 'y';
  
  while(yes =='y'|| yes =='y') {
	  
	  System.out.println("press\n1.Create Account \n2.Deposite \n3.Withdrawl \n4.Check");
       int select = Integer.parseInt(br.readLine());
       switch (select) {
       case 1:
	          obj.createAccount();
	   break;
       case 2:
    	   while(true) {
    		   if(obj.account==0.0) {
    			   System.out.println("First you have to create your account.");
    			   break;
    		   }
    		   else {
    			   obj.getDeposite();
    		   }
    		   
    		   break;
    	   }
	         
	   break;
       case 3:
    	   while(true) {
    		   
    		  if(obj.account==0) {
    			 System.out.println("You cannot access withdrawl unless you have an account with some money in it.");
    		   break;
    		   }
    		  else {
    			  obj.getWithdrawl();
    		  }
    		  break;
    	   }
	         
	   break;
	   
       case 4:
    	   while(true) {
    		   if(obj.account ==0.0) {
    			   System.out.println("First you have to create your account.");
    			   break;
    			   }
    			   else {
    				   obj.getBalance();
    			   }
    		   break;
    		   }
    	      
       break;

       default:
	   System.out.println("Enter valid choice");
	   break;
       }
  
      System.out.println("Do you wish to continue \n y or n");
      yes = (char) br.read();
    		  br.readLine();
   }
    
    
    
}

	
	void createAccount() throws IOException {
		super.setName();
		super.setMobile();
		super.setEmail();
		super.setGender();
		super.setOtp();
		
		System.out.println("\n\n");
		
		 super.getName(super.name);
		 super.getMobile(super.number);
		 super.getEmail(super.email);
		 super.getGender(super.gender);
		 super.getAccountNumber();
		
	}
	
}