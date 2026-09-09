package com.src.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxStringFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrs = Arrays.asList("Biswapriya", "Swapnadeep", "Katyani", "SomalBalSubramaniyam");
		String maxStr =	 arrs.stream()
						.max(Comparator.comparingInt(String::length))
						.orElse(null);
		System.out.println("String with maximum length: " + maxStr);
		
	}

}
