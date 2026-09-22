package com.src.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FrequencyFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10,20,30,40,10,60,20);
		Set<Integer> set = new LinkedHashSet<>(numbers);
		for(Integer n : set) {
			System.out.println(n + " ----> " + Collections.frequency(numbers, n));
		}
	}

}
