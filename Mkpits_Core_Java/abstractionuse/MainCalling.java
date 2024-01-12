package com.mkpits.abstractionuse;

public class MainCalling {

	public static void main(String[] args) {
		Animal obj = new Pig();
		Animal obj1 = new Tiger();
		
		obj.animalSound();
		obj.animalSleep();
		
		System.out.println("\n\n");
		
		obj1.animalSound();
		obj1.animalSleep();
		

	}

}
