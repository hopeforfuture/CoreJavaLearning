package com.src.streams.problems;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindFirstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Character> seen = new LinkedHashSet<>();
		Set<Character> duplicates = new LinkedHashSet<>();
		String str = "swiss";
		str.chars()
			.mapToObj(i -> (char) i)
			.forEach(ch -> {
				if(!seen.add(ch)) {
					duplicates.add(ch);
				}
			});
		
	   char ch =	str.chars()
			.mapToObj(i -> (char)i)
			.filter(c -> !duplicates.contains(c))
			.findFirst()
			.orElse(null);
	   
	   System.out.println(ch);
		
 	}

}
