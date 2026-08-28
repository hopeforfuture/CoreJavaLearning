package com.src.streams.problems;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestElementFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(-7,35,12,90,45,67,-45,100,34,89);
		int secondHighest = intList.stream()
		       .distinct()
		       .sorted(Comparator.reverseOrder())
		       .skip(1)
		       .findFirst()
		       .get();
		
		System.out.println(secondHighest);
	}

}
