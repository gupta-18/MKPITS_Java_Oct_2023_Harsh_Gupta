package com.mkpits.set;

import java.util.EnumSet;
import java.util.Set;

import javax.print.attribute.SetOfIntegerSyntax;
enum Const{
	HARSH, SAMIKSHA, RAJ, BAWAN,RAGHU,NATH;
}
public class EnumSetDemo {

	public static void main(String[] args) {
		        // Creating a set 
		        Set<Const> set1; 
		  
		        // Adding the elements 
		        set1 =  EnumSet.of(Const.BAWAN, Const.HARSH,Const.SAMIKSHA,Const.RAJ);
		      
		        set1= EnumSet.of(Const.RAGHU,Const.NATH);
		  
		        System.out.println("Set 1: " + set1); 
		    } 
	}


