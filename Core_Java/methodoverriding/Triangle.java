package com.mkpits.methodoverriding;

public class Triangle extends Rectangle {

	public void getArea() {
		int area = l *b*l;
		System.out.println(area+"triangle");
	}
	
}
