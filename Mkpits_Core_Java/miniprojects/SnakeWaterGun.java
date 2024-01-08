package com.mkpits.miniprojects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SnakeWaterGun {



	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rv = (int) Math.floor(Math.random()*100);
		System.out.println("Snake , Water and Gun game");
		
		
		
		
		char ch = 'y';
		
		while (ch == 'y'|| ch == 'Y') {
			System.out.println("To play press s,g,w");
			char ui =(char)br.read(); 
			br.readLine();
			
			switch (ui) {
			case 's':
				if( 33<rv && rv<66) {
					System.out.println("snake and water = snake win");
				}
				else if(66<rv && rv<=99) {
					System.out.println("snake and gun = gun win");
				}
				else {
					System.out.println("enter different value");
				}
				break;
			case 'w':
				if( 0<=rv && rv<33) {
					System.out.println("snake and water = snake win");
				}
				else if(66<rv && rv<=99) {
					System.out.println("water and gun = water win");
				}
				else {
					System.out.println("enter different value");
				}
				break;
			case 'g':
				if( 0<=rv && rv<33) {
					System.out.println("snake and gun = gun win");
				}
				else if(33<rv && rv<66) {
					System.out.println("snake and gun = gun win");
				}
				else {
					System.out.println("enter different value");
				}
				break;

			default:
				System.out.println("enter valid letter");
				break;
			}
			
			System.out.println("do u wish to continue\n y or n");
			ch = (char)br.read();
			br.readLine();
			
			
		}
		

	}

}
