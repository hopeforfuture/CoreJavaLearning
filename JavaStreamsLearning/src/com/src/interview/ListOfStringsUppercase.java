package com.src.interview;
import java.util.List;
import java.util.Arrays;

public class ListOfStringsUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Patric", "James", "Peter", "Andrew", "Kevin");
		List<String> upperCaseNames = names.stream()
			.map(s -> s.toUpperCase())
			.toList();
		
		System.out.println(upperCaseNames);
	}

}
