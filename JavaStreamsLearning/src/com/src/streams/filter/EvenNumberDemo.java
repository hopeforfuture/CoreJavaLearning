package com.src.streams.filter;

import java.util.Arrays;
import java.util.List;

public class EvenNumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> evenNums = nums.stream()
									.filter(n -> n%2 == 0)
									.toList();
		
		for(int i : evenNums) {
			System.out.println(i);
		}
	}

}
