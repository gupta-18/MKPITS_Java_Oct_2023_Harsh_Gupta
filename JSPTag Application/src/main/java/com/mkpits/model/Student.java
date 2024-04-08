package com.mkpits.model;

public class Student {
private String firstName;
private String lastName;
private boolean premiumUser;

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public boolean isPremiumUser() {
	return premiumUser;
}

public void setPremiumUser(boolean premiumUser) {
	this.premiumUser = premiumUser;
}

public Student(String firstName, String lastName, boolean premiumUser) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.premiumUser = premiumUser;
}
}
