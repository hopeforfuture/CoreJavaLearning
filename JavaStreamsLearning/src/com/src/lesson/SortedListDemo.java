package com.src.lesson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strs = Arrays.asList("Watermelon", "Banana", "Apple", "Cucumber", "Lemon", "Orange");
		
	    List<String> sortedStrs =	strs.stream()
			.sorted(Comparator.reverseOrder())
			.toList();
	    
	    for(String s : sortedStrs) {
	    	System.out.println(s);
	    }
	}

}
