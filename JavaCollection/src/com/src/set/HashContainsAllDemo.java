package com.src.set;

import java.util.HashSet;

public class HashContainsAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		HashSet<Integer> search = new HashSet<>();
		search.add(20);
		search.add(30);
		
		System.out.println(numbers + " contains " + search + " : " + numbers.containsAll(search));
	}

}
