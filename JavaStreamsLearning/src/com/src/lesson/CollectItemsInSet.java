package com.src.lesson;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectItemsInSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listNums = List.of(2,4,6,8,10,12,14,19,23,7);
		Set<Integer> setNums = listNums.stream()
				                       .filter(n -> n%2 != 0)
				                       .collect(Collectors.toSet());
		
		for(int n : setNums) {
			System.out.println(n);
		}
	}

}
