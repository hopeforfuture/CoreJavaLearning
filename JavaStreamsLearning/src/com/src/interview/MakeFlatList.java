package com.src.interview;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MakeFlatList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> nestedLists = Arrays.asList(
					Arrays.asList(1,3,5,6),
					Arrays.asList(2,7,9,3)
				);
		
		List<Integer> flatLists = nestedLists.stream()
										  .flatMap(List::stream)
										  .distinct()
										  .toList();
		
		for(int i : flatLists) {
			System.out.print(i + " ");
		}
	}

}
