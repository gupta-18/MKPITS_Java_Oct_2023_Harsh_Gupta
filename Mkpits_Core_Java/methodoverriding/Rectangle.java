package com.mkpits.methodoverriding;

public class Rectangle {
int l,b;
	
	public void getData(int l , int b) {
		this.l = l;
		this.b = b;
	}
	
	public void getArea() {
		int area = l *b;
		System.out.println(area);
	}
}