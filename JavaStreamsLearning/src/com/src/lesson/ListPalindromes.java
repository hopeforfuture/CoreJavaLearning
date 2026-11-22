package com.src.lesson;

import java.util.List;

public class ListPalindromes {
	public static void main(String[] args) {
		List<String> words = List.of(
                "madam", "java", "level", "hello",
                "radar", "world", "121"
        );
		
		List<String> palindromes = words.stream()
				                        .filter(word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString()))
				                        .toList();
		System.out.println(palindromes);
	}
}
