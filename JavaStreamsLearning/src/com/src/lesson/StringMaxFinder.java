package com.src.lesson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringMaxFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Apple", "Banana", "Guava", "Watermelon", "Cherry");
		String output = names.stream()
							 .max(Comparator.comparingInt(String::length))
							 .orElse(null);
		System.out.println(output);
	}

}
