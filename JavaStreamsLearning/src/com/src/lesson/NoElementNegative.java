package com.src.lesson;

import java.util.List;

public class NoElementNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numLists = List.of(9,0,10,11,21,21,15,6);
		boolean isExists = numLists.stream()
				                   .noneMatch(n -> n < 0);
		System.out.println(isExists);
		
	}

}
