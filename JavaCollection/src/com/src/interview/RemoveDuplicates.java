package com.src.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(10,20,10,30,20,40,50,10);
		Set<Integer> set = new LinkedHashSet<Integer>(list);
		List<Integer> uniqueList = new ArrayList<>(set);
		System.out.println(uniqueList);
	}

}
