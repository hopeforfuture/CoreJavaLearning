package com.src.interview;

import java.util.Arrays;
import java.util.List;

public class SumElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(2,4,6,8,10);
		int sum = list1.stream()
						.mapToInt(i -> i)
						.sum();
		
		System.out.println(sum);
	}

}
