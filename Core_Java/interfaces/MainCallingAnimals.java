package com.mkpits.interfaces;

public class MainCallingAnimals {

	public static void main(String[] args) {
		Lion obj = new Lion();
		Dinasorus obj1 = new Dinasorus();
		
		obj.animalSound();
		obj.animalSleeps();
		System.out.println("\n\n");
		obj1.animalSound();
		obj1.animalSleeps();

	}

}
