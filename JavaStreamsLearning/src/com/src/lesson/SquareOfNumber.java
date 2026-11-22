package com.src.lesson;

import java.util.List;

public class SquareOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(2,4,6,8,10);
		List<Integer> squareNums = nums.stream()
				                       .map(i -> i*i)
				                       .toList();
		System.out.println(squareNums);
	}

}
