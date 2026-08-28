package com.src.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PushNumbersToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(35, 25, 24, 32,101,98);
		Set<Integer> set = new HashSet<>();
		nums.stream()
			.filter(n -> {
				if(n%2 != 0) {
					set.add(n);
				}
				return n%2 != 0;
			}).toList();
		
		for(int i : set) {
			System.out.println(i);
		}
			
			
	}

}
