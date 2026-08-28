package com.src.interview;
import java.util.List;
import java.util.Arrays;

public class MaxValueFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intLists = Arrays.asList(10,-90,101,34,21,-15,65);
		int minValue = intLists.stream()
				.mapToInt(i -> i)
				.max()
				.getAsInt();
		
		System.out.println(minValue);
	}

}
