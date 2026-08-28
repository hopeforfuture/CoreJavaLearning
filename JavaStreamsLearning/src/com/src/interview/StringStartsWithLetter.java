package com.src.interview;

import java.util.Arrays;
import java.util.List;

public class StringStartsWithLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Patric", "Andrew", "James", "Peter", "Kevin", "Alex", "Harry");
	    List<String> filteredNames =	names.stream()
			.filter(s -> s.startsWith("A"))
			.toList();
	    
	    for(String s : filteredNames) {
	    	System.out.println(s);
	    }
	}

}
