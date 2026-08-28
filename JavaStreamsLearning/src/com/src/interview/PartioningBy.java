package com.src.interview;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

public class PartioningBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intLists = Arrays.asList(1, 2,3,4,5,6,7,8,9,10);
		Map<Boolean, List<Integer>> partionLists = intLists.stream()
													.collect(Collectors.partitioningBy(n -> n%2 == 0));
		System.out.println("Even List: " + partionLists.get(true));
		System.out.println("Odd List: " + partionLists.get(false));
	}

}
