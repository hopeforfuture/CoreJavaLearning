package com.src.streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringToStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple", "Banana", "Lemon", "Watermelon", "Cherry", 
				"Lichi", "Apple");
		
		Map<String, Integer> mapResults = fruits.stream()
												.collect(
													Collectors.toMap(
															s->s, 
															String::length,
															(oldValue, newValue) -> oldValue
													)	
												);
		
		for(var e : mapResults.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

}
