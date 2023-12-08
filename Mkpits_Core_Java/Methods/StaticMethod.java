package com.mkpits.Methods;

public class StaticMethod {

	public static void main(String[] args) {
	     
		System.out.println("This is direct calling in method");
		getFirstName();
		getLastName();
		getEmail();
		getMobile();
		getGender();
		getPassword();
		

	}

    public  static void getEmail() {
      String email = " harshg1807@gmail.com";
     System.out.println("Your email is:-" + email);
		
	}

    public  static void getMobile() {
		long number = 6394550077l;
		System.out.println("Your phone number is:-" + number );
	}

    public  static void getGender() {
		char gender = 'M';
		System.out.println("Your gender is:-" + gender );
	}

	public static void getPassword() {
		String password = "@qwerty234";
		System.out.println("Your password is:-" + password );
	}

	public static void getLastName() {
	  String lastName ="Gupta";
	System.out.println("Your last name is:-" +lastName );	
	}

    public  static void getFirstName() {
	 String name ="Harsh";
	System.out.println("Your name is:-" + name );	
	}

    public static void getAllData() {
    	getFirstName();
		getLastName();
		getEmail();
		getMobile();
		getGender();
		getPassword();
    	 
    }
}
