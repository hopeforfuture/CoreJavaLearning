package com.src.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergedTwoStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = Arrays.asList(7,8,9);
		
		List<Integer> list = Stream.concat(list1.stream(), list2.stream()).toList();
		
		for(int i : list) {
			System.out.println(i);
		}
	}

}
