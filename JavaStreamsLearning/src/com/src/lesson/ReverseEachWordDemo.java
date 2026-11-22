package com.src.lesson;

import java.util.List;

public class ReverseEachWordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("Apple", "Banana", "Lemon", "watermelon", "Cucumber");
		List<String> reversewords = words.stream()
				                         .map(word -> new StringBuilder(word).reverse().toString())
				                         .toList();
		for(String s : reversewords) {
			System.out.println(s);
		}
	}

}
