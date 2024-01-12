package com.mkpits.datesandtime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeClass1 {

	public static void main(String[] args) {

		LocalDateTime obj = LocalDateTime.now();
		System.out.println(obj);
		
		DateTimeFormatter obj1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		DateTimeFormatter obj2= DateTimeFormatter.ofPattern("E,dd-MMM-yyyy HH:mm:ss");
		DateTimeFormatter obj3 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter obj4 = DateTimeFormatter.ofPattern("dd-MM");
		String var =obj.format(obj1);
		System.out.println(var);
		var = obj.format(obj2);
		System.out.println(var);
		var = obj.format(obj3);
		System.out.println(var);
		var = obj.format(obj4);
		System.out.println(var);
	}

}
