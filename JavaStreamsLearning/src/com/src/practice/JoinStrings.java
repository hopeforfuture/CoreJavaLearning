package com.src.practice;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class JoinStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("James", "Mike", "Peter");
		String joinedString = names.stream()
					.collect(Collectors.joining(", "));
		
		System.out.println(joinedString);
	}

}
