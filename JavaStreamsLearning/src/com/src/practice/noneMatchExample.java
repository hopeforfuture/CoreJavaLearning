package com.src.practice;

import java.util.Arrays;
import java.util.List;

public class noneMatchExample {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(-1,2,3,4,45,56);
		
		boolean flag = nums.stream()
				.noneMatch(n -> n>100);
		
		System.out.println(flag);
	}
}
