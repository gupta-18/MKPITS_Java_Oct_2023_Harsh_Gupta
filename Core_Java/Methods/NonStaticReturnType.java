package com.mkpits.Methods;

public class NonStaticReturnType {

	public static void main(String[] args) {
	
       NonStaticReturnType data = new NonStaticReturnType();
       data.getAllData();
		
	}

	public void getAllData() {
		 System.out.println(getFirstName());
	     System.out.println(getLastName());
	     System.out.println(getMobile());
	     System.out.println(getEmail());
	     System.out.println(getPassword());
	     System.out.println(getGender());
		
	}

	public  char getGender() {
		char gender = 'M';
		return gender;
	}

	public  String getPassword() {
		String password = "@qwerty234";
		return password;
	}

	public  long getMobile() {
		long number = 6394550077l;
		return number;
	}

    public  String getEmail() {
    	String email = "harshg1807@gmail.com";
	    return email;
		
	}

	public String  getLastName() {
		String lastName ="Gupta";
		return lastName;
		
	}

	public String getFirstName() {
		String name ="Harsh";
		return name;
		
	}
	

}
