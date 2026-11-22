package com.src.lesson;

import java.util.List;

public class GetAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(12,10,9,-12,67,43,0);
		double avgDbl = nums.stream()
				            .mapToInt(i -> i)
				            .average()
				            .getAsDouble();
		System.out.println("Average: " + avgDbl);
	}

}
