package com.src.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FilterPrimeNumbers {
	
	public static boolean isPrimeNumber(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2; i<=n/2; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(100,75,50,-5,25,-15,67,32,0,13,17);
		List<Integer> primeNumbers = nums.stream()
										 .filter(n -> isPrimeNumber(n))
										 .sorted(Comparator.reverseOrder())
										 .toList();
		System.out.println(primeNumbers);
	}

}
