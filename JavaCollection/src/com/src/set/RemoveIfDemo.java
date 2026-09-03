package com.src.set;

import java.util.HashSet;

public class RemoveIfDemo {
	
	public static void printSet(HashSet<Integer> set) {
		for(Integer i : set) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(50);
		numbers.add(60);
		numbers.add(90);
		numbers.add(100);
		System.out.println("Initial set contents: ");
		printSet(numbers);
		numbers.removeIf(i -> i>50);
		System.out.println();
		System.out.println("Final set contents: ");
		printSet(numbers);
	}

}
