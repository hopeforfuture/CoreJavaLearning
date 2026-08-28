package com.src.practice;
import java.util.Arrays;
import java.util.List;

public class anyMatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(-1,2,3,4,45,56);
		boolean flag = nums.stream()
							.anyMatch(n -> n > 0);
		System.out.println(flag);
	}

}
