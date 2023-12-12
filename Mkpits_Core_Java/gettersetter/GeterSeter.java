package com.mkpits.gettersetter;

public class GeterSeter {
 String name, email, number;

 
 public GeterSeter(String name, String email, String number) {// pegle class variable create karna phir source me jake direct constructor generate karna 
	super();
	this.name = name;
	this.email = email;
	this.number = number;
}

public static void main(String[] args) {
		GeterSeter obj = new GeterSeter("harsh", "harshg1807@gmail.com", "6765868686");
		System.out.println(obj.getEmail());
		System.out.println(obj.getNumber());
		System.out.println(obj.getName());
	}
 
public String getName() { //source me jake getter setter generate karna 
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getNumber() {
	return number;
}
public void setNumber(String number) {
	this.number = number;
}
	

}
