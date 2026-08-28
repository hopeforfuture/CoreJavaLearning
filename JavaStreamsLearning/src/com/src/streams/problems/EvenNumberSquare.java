package com.src.streams.problems;
import java.util.*;

public class EvenNumberSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10,15,34,54,45,65,17);
		List<Integer> evenNumbersSquare = numbers.stream()
												.filter(i -> i%2 == 0)
												.limit(3)
												.map(n -> n*n)
												.toList();
		
		for(int n : evenNumbersSquare) {
			System.out.println(n);
		}
	}

}
