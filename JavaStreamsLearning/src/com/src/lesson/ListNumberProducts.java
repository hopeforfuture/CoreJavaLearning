package com.src.lesson;

import java.util.List;

public class ListNumberProducts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(2,4,6,8,10);
		int product = nums.stream()
				          .reduce(1, (a,b) -> a*b);
		System.out.println(product);
	}

}
