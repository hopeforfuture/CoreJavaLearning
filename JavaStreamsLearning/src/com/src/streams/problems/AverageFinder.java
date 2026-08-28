package com.src.streams.problems;
import java.util.List;
import java.util.Arrays;

public class AverageFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intNums = Arrays.asList(10,12,15,25,35,45,49,61,89,77);
		double average = intNums.stream()
								.mapToInt(n -> n)
								.average()
								.getAsDouble();
		
		System.out.println("Average: " + average);
	}

}
