package com.src.practice;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class secondHighestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intNums = Arrays.asList(-90,56,78,12,145,23,567,-78);
	  System.out.println(intNums.stream()
				.distinct()
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst()
				.orElse(null));
		
	}

}
