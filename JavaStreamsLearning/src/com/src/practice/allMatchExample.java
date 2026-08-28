package com.src.practice;
import java.util.Arrays;
import java.util.List;

public class allMatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(-1,2,3,4,45,56);
		boolean flag = nums.stream()
					.allMatch(n -> n > 0);
		
		System.out.println(flag);
	}

}
