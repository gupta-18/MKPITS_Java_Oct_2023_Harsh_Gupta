package com.mkpits.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String>names = Arrays.asList("Reflection","Collection","Stream");
		List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
		System.out.println(result);

	}

}
