package com.mkpits.set_hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice5HashCode {

	public static void main(String[] args) {

		
		Set<String> set = new HashSet<String>();
		set.add("harsh");
		set.add("gupta");
		
		//it gives a uni code value
		//koi bhi code generate karke deta hai
		System.out.println(set.hashCode());
		
		
	}

}
