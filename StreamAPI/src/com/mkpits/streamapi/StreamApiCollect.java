package com.mkpits.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiCollect {
//terminal  operation
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,3,4,5,3);
		Set <Integer> square = number.stream().map(x->x*x).collect(Collectors.toSet());
		System.out.println(square);
	}

}
