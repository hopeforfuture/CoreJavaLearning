package com.src.streams.problems;
import java.util.List;
import java.util.Arrays;

public class ListStringReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strs = Arrays.asList("Watermelon", "Banana", "Apple", "Cucumber", "Lemon", "Orange");
		List<String> sortedStrings = strs.stream()
			.sorted()
			.toList();
		
		for(String s : sortedStrings) {
			System.out.println(s);
		}
	}

}
