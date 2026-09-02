package com.src.lesson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordToLengthMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strs = Arrays.asList( "Watermelon", "Banana", "Cucumber", "Apple");
	    Map<String, Integer> wordToWordLength =	strs.stream()
			.collect(
				Collectors.toMap(s->s, String::length, (oldValue, newValue) -> oldValue)	
			);
	    
	    for(var e : wordToWordLength.entrySet()) {
	    	System.out.println(e.getKey() + " : " + e.getValue());
	    }
	}

}
