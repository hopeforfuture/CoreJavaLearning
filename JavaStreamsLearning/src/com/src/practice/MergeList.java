package com.src.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class MergeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3)) ;
		List<Integer> list2 = new ArrayList<>(Arrays.asList(4,5,3,6));
		//list1.addAll(list2);
		//Collections.shuffle(list1);
		//System.out.println(list1);
		
		List<Integer> list3 = Stream.concat(list1.stream(), list2.stream())
									.distinct()
									.toList();
		System.out.println(list3);
	}

}
