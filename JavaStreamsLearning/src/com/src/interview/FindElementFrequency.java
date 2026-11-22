package com.src.interview;
import java.util.*;
import java.util.stream.Collectors;

public class FindElementFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(1,1,2,3,4,3,2,5,6,7,9,4);
		Map<Integer, Long> frequencyFinder = numbers.stream()
				                                    .collect(Collectors.groupingBy(s->s, Collectors.counting()));
		
		for(var e : frequencyFinder.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

}
