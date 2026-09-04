package com.src.set;

import java.util.TreeSet;

public class TreeSetCustomSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>((a,b) -> (b-a));
		numbers.add(10);
		numbers.add(100);
		numbers.add(30);
		numbers.add(70);
		numbers.add(60);
		System.out.println("Original set contains: " + numbers);
	}

}
