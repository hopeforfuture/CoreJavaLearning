package com.src.practice;

import java.util.Arrays;
import java.util.List;

public class GetAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(100,75,50,-5,25,-15,67,32,0);
		double avg = nums.stream()
						.mapToInt(i -> i)
						.average()
						.getAsDouble();
		System.out.println(avg);
	}

}
