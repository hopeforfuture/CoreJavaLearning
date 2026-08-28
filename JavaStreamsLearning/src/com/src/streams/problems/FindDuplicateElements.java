package com.src.streams.problems;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = Arrays.asList(10, 20, 30, 40, 20,30,35,10);
		Set<Integer> set = new HashSet<>();
		
		List<Integer> duplicates = intList.stream()
										.filter(n -> !set.add(n))
										.toList();
		
		for(int n : duplicates) {
			System.out.println(n);
		}
	}

}
