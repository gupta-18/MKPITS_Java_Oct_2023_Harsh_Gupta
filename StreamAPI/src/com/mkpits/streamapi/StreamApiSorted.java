package com.mkpits.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> names = Arrays.asList("Reflection","Collection","Stream","Cat");
		List <String>result = names.stream().sorted().collect(Collectors.toList());
		System.out.println(result);
	}

}
