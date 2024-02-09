package com.mkpits.multilevelinheritance;

public class Test1 {
int rollNum,num1,num2;
 int harsh,samiksha;
String name;
protected void getInfo(int num, String name) {
	rollNum = num;
	this.name= name;
	
	System.out.println(rollNum);
	System.out.println(this.name);
}
}
