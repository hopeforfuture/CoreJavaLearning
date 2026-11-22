package com.src.lesson;

import java.util.List;

public class AllElementsPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = List.of(-7,-8,9,10,12,-34,43,53,-21);
		boolean flag = nums.stream()
				            .allMatch(n -> n>0);
		System.out.println(flag);
	}

}
