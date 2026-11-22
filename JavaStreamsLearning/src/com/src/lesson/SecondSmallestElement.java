package com.src.lesson;

import java.util.List;

public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(9,2,15,11,3,56,34);
		int output = nums.stream()
				         .distinct()
				         .sorted()
				         .skip(1)
				         .findFirst()
				         .orElse(null);
		System.out.println(output);
	}

}
