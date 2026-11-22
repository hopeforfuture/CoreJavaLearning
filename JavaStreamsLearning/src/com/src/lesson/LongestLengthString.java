package com.src.lesson;

import java.util.List;

public class LongestLengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> fruits = List.of("Apple", "Banana", "Watermelon", "Lemon", "Papaya", "Litchi", "Cherry");
		int len = fruits.stream()
		      .mapToInt(String::length)
		      .max()
		      .orElse(0);
		System.out.println(len);
	}

}
