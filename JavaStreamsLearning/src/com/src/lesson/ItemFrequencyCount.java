package com.src.lesson;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemFrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = Arrays.asList("Apple", "Banana", "Guava", "Lemon", "Watermelon", "Cucumber", "Apple", "Cherry", "Banana", "Guava");
		Map<String, Long> itemFrequencyCount = fruits.stream()
													 .collect(Collectors.groupingBy(word->word, Collectors.counting()));
		
		for(var e : itemFrequencyCount.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

}
