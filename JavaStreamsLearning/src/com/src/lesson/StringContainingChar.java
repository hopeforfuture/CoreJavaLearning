package com.src.lesson;

import java.util.List;

public class StringContainingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = List.of("Apple", "Banana", "Watermelon", "Lemon", "Lichi", "Papaya", "Cucumber");
		List<String> results = fruits.stream()
				                     .filter(s -> s.contains("C"))
				                     .toList();
		System.out.println(results);
	}

}
