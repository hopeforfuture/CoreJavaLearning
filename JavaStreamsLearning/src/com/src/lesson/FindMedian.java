package com.src.lesson;

import java.util.List;

public class FindMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(2,4,6,8,7,9,-12,34);
		List<Integer> sortedNums = nums.stream()
				                       .sorted()
				                       .toList();
		int size = sortedNums.size();
		int firstElement = 0;
		int secondElement = 0;
		double median = 0;
		if(size % 2 == 0) {
			firstElement = sortedNums.get(size/2 - 1);
			secondElement = sortedNums.get(size/2);
			median = (firstElement + secondElement) / 2;
		} else {
			median = sortedNums.get(size/2);
		}
		System.out.println("Median: " + median);
	}

}
