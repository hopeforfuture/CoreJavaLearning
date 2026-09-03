package com.src.set;

import java.util.TreeSet;

public class FirstLastLowerFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(5);
		numbers.add(15);
		numbers.add(100);
		numbers.add(70);
		
		System.out.println("Original set contains: ");
		for(Integer i : numbers) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("First element: " + numbers.first());
		System.out.println("Last element: " + numbers.last());
		System.out.println("Lower than 30 : " + numbers.lower(30));
		System.out.println("Floor  30 : " + numbers.floor(30));
		
	}

}
