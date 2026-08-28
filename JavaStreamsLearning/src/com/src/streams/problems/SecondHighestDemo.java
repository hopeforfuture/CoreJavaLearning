package com.src.streams.problems;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(10,15,20,25,30,35,40,-1,79,21,345,11,231,20,30);
		int secondHighest = intList.stream()
								.distinct()
								.sorted(Comparator.reverseOrder())
								.skip(1)
								.findFirst()
								.orElse(null);
		
		System.out.println("Second Highest: " + secondHighest);
	}

}
