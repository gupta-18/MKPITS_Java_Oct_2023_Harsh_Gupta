package com.mkpits.singleinheritance;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {
		ChildClass obj = new ChildClass();
		System.out.println("\t\tInformation form\n");
		obj.takeInput();
		obj.getDetails();

	}

}
