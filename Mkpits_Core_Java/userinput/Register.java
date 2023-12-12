package com.mkpits.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Register {
 String name , email,password;
 int age,id;
 long mobile;
 char ch;
 
	public static void main(String[] args) throws IOException {
		Register register = new Register();
		register.getData();

	}

	public  void getData() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Your name");
		this.name = br.readLine();
		
		System.out.println("Enter Your id");
		this.id = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Your age");
		this.age = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Your email");
		this.email = br.readLine();
		
		System.out.println("Enter Your mobile");
		this.mobile = Long.parseLong(br.readLine());
		
		System.out.println("Enter Your gender");
		//String ch = br.readLine();//idhar ch string me store hoga 
		//this.ch = ch.charAt(0);// fir ch class variable me 0 index ka character store hoga 
		
		this.ch = (char)br.read();//sirf ye use kiya to eg.Male likha to sirf M lega or baad ka password skip hoga or sif "ale" le lega isliye
		br.readLine();//ye line bhi likhni padegi
		
		
		
		System.out.println("Enter Your password");
		this.password = br.readLine();
		
		
	}

}
