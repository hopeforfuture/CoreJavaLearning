package com.src.set;

import java.util.Arrays;
import java.util.TreeSet;

public class DescendingIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(80,90,30,45,-15,67,34));
		var iterator = numbers.descendingIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
