package com.src.lesson;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstUniqueCharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swiss";
		Set<Character> seen = new LinkedHashSet<>();
		Set<Character> duplicates = new LinkedHashSet<>();
		
		str.chars()
			.mapToObj(ch -> (char)ch)
			.forEach(ch -> {
				if(!seen.add(ch)) {
					duplicates.add(ch);
				}
			});
		
		char output = str.chars()
			.mapToObj(ch -> (char) ch)
			.filter(ch -> !duplicates.contains(ch))
			.findFirst()
			.orElseThrow();
		
		System.out.println("First unique char in the string: " + output);
	}

}
