package com.src.lesson;

import java.util.List;

public class RemoveDuplicateWordFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = List.of("Apple", "Banana", "Orange", "Lemon", "Watermelon", "Papaya", "Banana");
		List<String> uniqueWords = words.stream()
				                        .distinct()
				                        .toList();
		System.out.println(uniqueWords);
	}

}
