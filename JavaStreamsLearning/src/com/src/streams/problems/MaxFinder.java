package com.src.streams.problems;
import java.util.List;
import java.util.Arrays;

public class MaxFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(1, 2, -13, 4, 5, 67, 7, 8, 9, 10, -1);
		int min = nums.stream()
				.mapToInt(i -> i)
				.min()
				.getAsInt();
		
		System.out.println("Original list: ");
		for(int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println("Minimum Number: " + min);
		
		int max = nums.stream()
				.mapToInt(i -> i)
				.max()
				.getAsInt();
		System.out.println("Maximum Number: " + max);
	}

}
