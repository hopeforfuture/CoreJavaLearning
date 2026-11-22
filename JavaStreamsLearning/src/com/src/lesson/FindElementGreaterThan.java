package com.src.lesson;

import java.util.List;

public class FindElementGreaterThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listNums = List.of(2,4,6,8,10,12,14,16,-2);
		List<Integer> greaterNums = listNums.stream()
				                            .filter(p -> p>10)
				                            .toList();
		System.out.println(greaterNums);
	}

}
