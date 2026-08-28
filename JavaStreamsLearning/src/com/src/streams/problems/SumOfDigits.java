package com.src.streams.problems;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 12345;
		
		int sum = String.valueOf(n).chars()
				.map(ch -> Character.getNumericValue(ch))
				.sum();
		
		System.out.println("Sum: " + sum);
	}

}
