package com.src.lesson;

import java.util.List;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(12,10,9,-12,67,43,0);
		int min = nums.stream()
		             .mapToInt(i -> i)
		             .min().getAsInt();
		System.out.println("Min value: " + min);
	}

}
