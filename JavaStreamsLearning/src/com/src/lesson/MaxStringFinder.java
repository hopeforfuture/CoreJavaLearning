package com.src.lesson;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxStringFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strs = Arrays.asList("Swarnendu", "Soumabho", "Anirban","Rohitaswa", "Diptopriyo", "Pundarikakhya");
		
	    String output =	strs.stream()
			.max(Comparator.comparingInt(String::length))
			.orElse(null);
	    System.out.println(output);
	}

}
