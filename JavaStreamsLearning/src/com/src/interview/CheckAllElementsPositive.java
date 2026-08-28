package com.src.interview;

import java.util.Arrays;
import java.util.List;

public class CheckAllElementsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(10, 20, 30, 40, 100);
		boolean b = nums.stream()
						.allMatch(n -> n > 0);
		System.out.println(b);
	}

}
