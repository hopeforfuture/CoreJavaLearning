package com.src.set;

import java.util.TreeSet;

public class HeadTailSubsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(30);
		numbers.add(10);
		numbers.add(40);
		numbers.add(20);
		numbers.add(70);
		numbers.add(50);
		
		System.out.println("Original Set Contains: " + numbers);
		System.out.println("Head Set Range 30: " + numbers.headSet(30, true));
		System.out.println("Tail Set Range 30: " + numbers.tailSet(30, false));
		System.out.println("Subset between 20 and 50: " + numbers.subSet(20, false, 50, true));
	}

}
