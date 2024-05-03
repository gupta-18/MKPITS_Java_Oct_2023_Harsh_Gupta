package com.mkpits.registrations;

public class ModalClass {
 int id;
 String username;
 String mobile;
 String  email;
 String  city;
 String  gender;
 String password;
public ModalClass(int id, String username, String mobile, String email, String city, String gender, String password) {
	super();
	this.id = id;
	this.username = username;
	this.mobile = mobile;
	this.email = email;
	this.city = city;
	this.gender = gender;
	this.password = password;
}
public ModalClass(String username, String mobile, String email, String city, String gender, String password) {
	super();
	this.username = username;
	this.mobile = mobile;
	this.email = email;
	this.city = city;
	this.gender = gender;
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "ModalClass [id=" + id + ", username=" + username + ", mobile=" + mobile + ", email=" + email + ", city="
			+ city + ", gender=" + gender + ", password=" + password + "]";
}
 
 
 
	
}
