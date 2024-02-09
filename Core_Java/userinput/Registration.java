package com.mkpits.userinput;

import java.io.IOException;

public class Registration {

	public static void main(String[] args) throws IOException {
		Register form = new Register();
		form.getData();
		System.out.println("Your name is :-"+form.name);
		System.out.println("Your id is :-"+form.id);
		System.out.println("Your age is :-"+form.age);
		System.out.println("Your gender is :-"+form.ch);
		System.out.println("Your email is :-"+form.email);
		System.out.println("Your number is :-"+form.mobile);
		System.out.println("Your password is :-"+form.password);
	}

}
