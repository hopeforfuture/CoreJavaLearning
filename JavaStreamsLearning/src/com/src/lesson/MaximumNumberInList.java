package com.src.lesson;

import java.util.Arrays;
import java.util.List;

public class MaximumNumberInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(50,12,21,35,79,-121,342,12,-198);
		int maxVal = numbers.stream()
							.mapToInt(i -> i)
							.max()
							.orElseThrow();
		System.out.println("Maximum value in " + numbers + " : " + maxVal);
	}

}
