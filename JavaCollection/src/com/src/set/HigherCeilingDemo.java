package com.src.set;

import java.util.TreeSet;

public class HigherCeilingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(5);
		numbers.add(15);
		numbers.add(100);
		numbers.add(70);
		numbers.add(30);
		System.out.println("Original set content: " + numbers);
		System.out.println("Higher than 30: " + numbers.higher(30));
		System.out.println("Ceiling to 30: " + numbers.ceiling(30));
	}

}
