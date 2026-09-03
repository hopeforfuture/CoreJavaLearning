package com.src.set;

import java.util.TreeSet;

public class PollFirstLastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(100);
		numbers.add(10);
		numbers.add(50);
		numbers.add(80);
		numbers.add(25);
		
		System.out.println("Original Set Contains: " + numbers);
		Integer i = numbers.pollFirst();
		System.out.println("Pollfirst Element: " + i);
		System.out.println("Present Set Contains: " + numbers);
		i = numbers.pollLast();
		System.out.println("Polllast Element: " + i);
		System.out.println("Present Set Contains: " + numbers);
		System.out.println("Descending Set: " + numbers.descendingSet());
	}

}
