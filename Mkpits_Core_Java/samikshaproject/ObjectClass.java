package com.mkpits.samikshaproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ObjectClass {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ChildClass obj = new ChildClass();
     
		System.out.println("enter first name :");
        obj.fname = br.readLine();
       while(obj.fname.isBlank()) {
    	 System.out.println("Invalid name ! please enter name");
    	 obj.fname =br.readLine();
     }
     
     System.out.println("enter last name :");
     obj.lname = br.readLine();
     while(obj.lname.isBlank()) {
    	 System.out.println("please enter last name");
    	 obj.lname =br.readLine();
     }
     
     
     System.out.println("enter email: ");
     obj.email=br.readLine();
     
 
	  while(obj.email.isBlank()) {
		     System.out.println("please enter email it cannot be blank ");
	    	 obj.email =br.readLine();
	    	 
	     String regex = "^(.+)@(.+)$";  
         //Compile regular expression to get the pattern  
         Pattern pattern = Pattern.compile(regex);    
         //Create instance of matcher   
         Matcher matcher = pattern.matcher(obj.email); 
         
         if (!(matcher.matches())) {
        	   System.out.println("Email Not Valid");
 				 System.out.println("enter email: ");
 			     obj.email=br.readLine();
 			     continue;
 	     } 
      break; 	 
      }
	  
	  while(!obj.email.isBlank()) {
		   
	  String regex = "^(.+)@(.+)$";  
      //Compile regular expression to get the pattern  
      Pattern pattern = Pattern.compile(regex);    
      //Create instance of matcher   
      Matcher matcher = pattern.matcher(obj.email); 
      
      while (!(matcher.matches())) {
     	   System.out.println("Email Not Valid");
				 System.out.println("enter email: ");
			     obj.email=br.readLine(); 
	  }
      break;
	  }
	  
	 
 
	  
//		 while(obj.email.isBlank()){
//			    	 System.out.println("please enter email it cannot be blank ");
//			    	 obj.email =br.readLine();
//			     }
		  
	 
     System.out.println("enter mob: ");
     obj.mob = br.readLine();
     if(obj.mob.length()!=10) {
    	 System.out.println("mobile number must have 10 digit: ");
         obj.mob = br.readLine();}
     
     while(obj.mob.isEmpty()) {
    	 System.out.println("please enter mobile number");
    	 obj.mob = br.readLine();
    	 
    	 if(obj.mob.length()!=10) {
        	 System.out.println("mobile number must have 10 digit: ");
             obj.mob = br.readLine();}
      }
     
     System.out.println(" enter gender f/m: ");
     obj.g=   br.readLine();
     while(obj.g!="f"&& obj.g!="F"||obj.g!="m"&& obj.g!="M") {
    	 System.out.println("enter valid choice f/m");
    	 obj.g=   br.readLine();
    	 if(obj.g=="f"||obj.g=="F"||obj.g=="m"||obj.g=="M"){
    		 break;
    	 		}break;
     }
     
//     while(obj.g.isBlank()) {
//    	 System.out.println("please enter gender");
//    	 obj.g= br.readLine();
//     
//     if(obj.g=="f"||obj.g=="F"||obj.g=="m"||obj.g=="M"){
// 		System.out.println(obj.g);
// 		}else {
// 			System.out.println("enter valid choice f/m");
// 		
// 		}
//        
//     }
     
     System.out.println("enter pincode: ");
     obj.pinCode=br.readLine();
     while(obj.pinCode.length()!=6) {
    	 System.out.println("Pincode must have 6 digit");
    	 obj.pinCode=br.readLine();
     }
     
     obj.getDetails(); 	
    
	}

}
