package com.src.practice;

import java.util.Arrays;
import java.util.List;

public class FindFirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(-1,2,3,4,45,56,35);
		
	    int result =	nums.stream()
			.filter(n -> n%5 == 0)
			.findFirst()
			.orElse(null);
	    
	    System.out.println(result);
	}

}
