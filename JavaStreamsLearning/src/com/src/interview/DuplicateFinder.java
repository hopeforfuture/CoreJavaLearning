package com.src.interview;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intLists = Arrays.asList(10,-90,101,34,21,-15,65,34,-90);
		Set<Integer> set = new HashSet<>();
		List<Integer> duplicates = intLists.stream()
				.filter(n -> !set.add(n))
				.toList();
		
		for(int n : duplicates) {
			System.out.println(n);
		}
	}

}
