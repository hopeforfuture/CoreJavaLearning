package com.src.lesson;

import java.util.List;

public class CountCharsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("Apple", "Watermelon", "Papaya");
		List<String> output = words.stream()
				                    .map(word -> word + " = " + word.length())
				                    .toList();
		
		System.out.println(output);
				                    
	}

}
