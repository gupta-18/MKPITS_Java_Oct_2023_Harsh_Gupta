package com.mkpits.singleinheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.management.StringValueExp;

public class ChildClass extends ParentClass {
	long number;
	String gender;
	Integer pincode;
	
	long getNumber(long num) {
		return num;
	}
	
	
	char getGender(String gender) {
	char gen=gender.charAt(0);
	return gen;
	}
	
	
	int getPinCode(int code) {
		return code;
	}
	
	
	void takeInput() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter your first name");
		this.firstnName = br.readLine();
		while(this.firstnName.isBlank()) {
			System.out.println(" First name cannot be blank Enter your first name");
			this.firstnName = br.readLine();
		}
		
		System.out.println("Enter your last name");
		this.lastName = br.readLine();
		while(this.lastName.isBlank()) {
			System.out.println("Last name cannot be blank Enter your last name");
			this.lastName = br.readLine();
		}
		
		System.out.println("Enter your email");
		this.email = br.readLine();
//if( !this.email.contains("@")) {
//System.out.println(" Invalid email");
//return this.email;
//} 
		while(!this.email.contains("@")) {
		System.out.println(" Invalid email");
		System.out.println("Enter your email");
		this.email = br.readLine();
		}
		
		System.out.println("Enter your gender");
		this.gender = br.readLine();	
		while(this.gender.isBlank()) {
			System.out.println("Gender cannot be blank Enter your gender");
			this.gender = br.readLine();
		}	
		
		System.out.println("Enter your mobile number");
		this.number = Long.parseLong(br.readLine());
		String longNum = String.valueOf(this.number);
		while(longNum.length()!=10) {
//			String regex = "\\d{10}";
//	        Pattern pattern = Pattern.compile(regex);
//	        Matcher matches = pattern.matcher(longNum);
            System.out.println("Number must have 10 digits ");
			this.number = Long.parseLong(br.readLine());
			longNum = String.valueOf(this.number);
// Check if the string representation of the long matches the pattern
//return pattern.matcher(longNum).matches();
		}
		
		
		System.out.println("Enter your pincode");
		this.pincode = Integer.parseInt(br.readLine());
		String pin = String.valueOf(pincode);
	while(pin.length()!=6) {
		    System.out.println("Pincode must have 6 digits ");
		    System.out.println("Enter your pincode");
			this.pincode = Integer.parseInt(br.readLine());
			pin = String.valueOf(pincode);
		}
		
		
	}
	
	
	
	void getDetails() throws IOException {
	  ChildClass obj = new ChildClass();
		
	 System.out.println("\n\n**Your info page is here**\n");
		obj.getFirstName(this.firstnName);
		obj.getLastName(this.lastName);
		obj.getEmail(this.email);
		System.out.println("Your gender is :- "+obj.getGender(this.gender));
		System.out.println("Your mobile number is:-" +obj.getNumber( this.number));;
		System.out.println("Your pincode is:-" +obj.getPinCode(this.pincode));;
		
		
		
		
	}
	
}
