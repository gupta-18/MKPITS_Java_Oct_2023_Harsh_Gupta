package com.mkpits.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListBytePrint {

	public static void main(String[] args) {
		List<Byte> obj = new ArrayList<Byte>();
		obj.add((byte) 1);
		obj.add((byte) 2);
		obj.add((byte) 3);
		
		Iterator<Byte> obj1 = obj.iterator();
		while (obj1.hasNext()) {
			Byte byte1 = (Byte) obj1.next();
			System.out.println(byte1);
		}

	}

}
