package com.src.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ElementFrequencyFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intLists = Arrays.asList(1, 2,3,4,5,6,7,8,9,10,2,10,3,4,5);
	    Map<Integer, Long> frequencyLists =	intLists.stream()
				.collect(Collectors.groupingBy(s->s, 
						Collectors.counting()));
	    
	    for(var e : frequencyLists.entrySet()) {
	    	System.out.println(e.getKey() + " appears " + e.getValue() + " times");
	    }
	}

}
