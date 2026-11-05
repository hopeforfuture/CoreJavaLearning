package com.src.lesson;

public class SumDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 54321;
		int sum = String.valueOf(n)
						.chars()
						.map(ch -> Character.getNumericValue(ch))
						.sum();
		System.out.println("Sum is: " + sum);
	}

}
