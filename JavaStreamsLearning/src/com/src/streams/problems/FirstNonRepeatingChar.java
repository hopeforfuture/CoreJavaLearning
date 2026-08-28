package com.src.streams.problems;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "swiss";
		
		char result = str.chars()
									.mapToObj(ch -> (char)ch)
									.collect(
										Collectors.groupingBy(
										   s->s,
										   LinkedHashMap::new,
										   Collectors.counting()
										)	
									 )
									.entrySet()
									.stream()
									.filter(entry -> entry.getValue() == 1)
									.map(Map.Entry::getKey)
									.findFirst()
									.orElse(null);
		
		System.out.println("First Non repeating charavter: " + result);
		
		System.out.println("------------Simplified Version of the above program---------------");
		Set<Character> seen = new HashSet<>();
		Set<Character> duplicates = new HashSet<>();
		str.chars()
			.mapToObj(i -> (char)i)
			.forEach(ch -> {
				if(!seen.add(ch)) {
					duplicates.add(ch);
				}
			});
		
	    char result2 =	str.chars()
			.mapToObj(i -> (char)i)
			.filter(ch -> !duplicates.contains(ch))
			.findFirst()
			.orElse(null);
	    
	    System.out.println("First Non repeating charavter: " + result2);
									
	}

}
