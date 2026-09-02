package com.src.lesson;

import java.util.HashSet;
import java.util.Set;

public class FindNonRepeatingCharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swiss";
		Set<Character> seen = new HashSet<>();
		Set<Character> duplicates = new HashSet<>();
		
		str.chars()
			.mapToObj(ch -> (char) ch)
			.forEach(ch -> {
				if(!seen.add(ch)) {
					duplicates.add(ch);
				}
			});
		
		char output = str.chars()
			.mapToObj(ch -> (char)ch)
			.filter(ch -> !duplicates.contains(ch))
			.findFirst()
			.orElse(null);
		
		System.out.println("The first non repeating charcater in " + str + " : " + output);
	}

}
