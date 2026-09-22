package com.src.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1,2,2,3,4,4,4,5,6,1);
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		for(Integer n : nums) {
			if(!seen.add(n)) {
				duplicates.add(n);
			}
		}
		System.out.println(duplicates);
	}

}
