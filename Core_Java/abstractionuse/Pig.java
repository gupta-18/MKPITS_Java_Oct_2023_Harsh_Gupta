package com.mkpits.abstractionuse;

public class Pig extends Animal {

 @Override
public void animalSound() {
System.out.println("Pig Says weeh weeh");
	
}
	@Override
		void animalSleep() {
			super.animalSleep();
		}

}
