package com.src.lesson;

import java.util.List;

public class SumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listNums = List.of(2,4,6,8,10,12,14,16,-5);
		int sum = listNums.stream()
				          .mapToInt(i -> i)
				          .sum();
		System.out.println(sum);
	}

}
