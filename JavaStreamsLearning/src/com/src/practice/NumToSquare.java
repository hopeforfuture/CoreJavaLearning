package com.src.practice;

import java.util.Arrays;
import java.util.List;

public class NumToSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(2,4,6,8,10);
		List<Integer> numsSquare = nums.stream()
									.map(i -> i*i)
									.toList();
		System.out.println(numsSquare);
	}

}
