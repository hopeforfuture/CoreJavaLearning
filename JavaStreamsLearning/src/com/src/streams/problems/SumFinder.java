package com.src.streams.problems;
import java.util.List;
import java.util.Arrays;

public class SumFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intLists = Arrays.asList(10,15,20,25,30,35,40);
		
		int sum = intLists.stream()
					.mapToInt(n -> n)
					.sum();
		
		System.out.println("Sum is: " + sum);
	}

}
