package com.src.lesson;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 67834;
		int digitSum = String.valueOf(number)
			  .chars()
			  .map(ch -> Character.getNumericValue(ch))
			  .sum();
		System.out.println(digitSum);
	}

}
