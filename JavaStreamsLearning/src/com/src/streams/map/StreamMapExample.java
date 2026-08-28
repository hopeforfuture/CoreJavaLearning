package com.src.streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple", "Banana", "Lemon", "Watermelon", "Cherry");
		
		List<String> fruitsCapitalCase = fruits.stream().map(c -> c.toUpperCase()).toList();
		for(String s : fruitsCapitalCase) {
			System.out.println(s);
		}
	}

}
