package com.src.lesson;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondHighestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(10,9,8,7,6,-90,105,21,35,34,55,-5);
		int second_highest = nums.stream()
				                 .distinct()
				                 .sorted(Comparator.reverseOrder())
				                 .skip(1)
				                 .findFirst()
				                 .orElse(null);
		System.out.println(second_highest);
	}

}
