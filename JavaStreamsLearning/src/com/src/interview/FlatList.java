package com.src.interview;
import java.util.List;
import java.util.Arrays;

public class FlatList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> intLists = Arrays.asList(
					Arrays.asList(1,2,3,4,5),
					Arrays.asList(7, 8, 9)
				);
		
		List<Integer> flatLists = intLists.stream()
				.flatMap(List::stream)
				.toList();
		
		for(int n : flatLists) {
			System.out.println(n);
		}
	}

}
