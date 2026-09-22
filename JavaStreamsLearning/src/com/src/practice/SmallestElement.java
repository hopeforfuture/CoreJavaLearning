package com.src.practice;

import java.util.Arrays;
import java.util.List;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(100,75,50,-5,25,-15,67,32,0);
		int min = nums.stream()
					.mapToInt(i->i)
					.min()
					.getAsInt();
		System.out.println(min);
	}

}
