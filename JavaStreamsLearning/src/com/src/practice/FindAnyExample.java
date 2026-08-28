package com.src.practice;

import java.util.Arrays;
import java.util.List;

public class FindAnyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(-1,2,3,4,45,56,35, 25, 75, 80,39);
				
	    int result = nums.stream()
			.filter(n -> n%5 == 0)
			.findAny()
			.orElse(null);
	    
	    System.out.println(result);
	}

}
