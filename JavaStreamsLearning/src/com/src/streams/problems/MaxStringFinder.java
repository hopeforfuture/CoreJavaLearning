package com.src.streams.problems;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class MaxStringFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Manojit", "Ayan", "Biswadeep", "Diptopriyo");
		String strHighestLen = names.stream()
									.max(Comparator.comparingInt(String::length))
									.orElse(null);
		
		System.out.println("String with max length: " + strHighestLen);
	}

}
