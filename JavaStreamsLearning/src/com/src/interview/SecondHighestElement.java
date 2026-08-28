package com.src.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(23,12,121,-90,45,21,75,115);
		int second_highest = numbers.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.get();
		
		System.out.println(second_highest);
	}

}
