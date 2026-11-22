package com.src.practicetwo;

import java.util.Comparator;
import java.util.List;

public class FilterPrimeNumber {
	
	
	public static boolean isPrime(int n) {
		if(n <= 2) {
			return true;
		}
		for(int i=2; i<=n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(2,3,4,5,6,7,8,9,11,12,14,16,18,24,25);
		List<Integer> primeNumbersList = numbers.stream()
				                                .filter(n -> isPrime(n))
				                                .sorted(Comparator.reverseOrder())
				                                .toList();
		
		System.out.println(primeNumbersList);
	}

}
