package com.mkpits.Methods;

public class MethodWithArgument {

	public static void main(String[] args) {
		
		String name = "Harsh";
		String email = "harshg1807@gmail.com";
		String lastName = "Gupta";
		long number = 6394550077l; 
		char gender = 'M';
//the variable name must be same in argument and values given in variables
		MethodWithArgument obj = new MethodWithArgument();
		 obj.getName("karan");
		 obj.getName(name);
		obj.getLastName(lastName);
		obj.getEmail(email);
		obj.getNumber(number);
		obj.getGender(gender);
	}
   public void getGender(char gender) {
		System.out.println(gender);
	}
// similarly in methods parameters must have same names2
	public static void getNumber(long mobileNumber) {
		System.out.println(mobileNumber);
		
	}

	public void getLastName(String lastName) {
		System.out.println(lastName);
		
	}

	public void getEmail(String mail) {
		System.out.println(mail);
		
	}

	public void getName(String firstName) {
		System.out.println(firstName);
		
	}

}
