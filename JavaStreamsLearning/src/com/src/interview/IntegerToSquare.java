package com.src.interview;

import java.util.Arrays;
import java.util.List;

public class IntegerToSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intNums = Arrays.asList(41, 42, 43, 55, 66);
		List<Integer> intSquateNums = intNums.stream()
											 .map(i -> i * i)
											 .toList();
		
		for(int i : intSquateNums) {
			System.out.println(i);
		}
	}

}
