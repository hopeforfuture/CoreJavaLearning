package com.src.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(-101,101,35,67,90,32,-78,78,97);
		int output = nums.stream()
			.distinct()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst()
			.get();
		
		System.out.println(output);
	}

}
