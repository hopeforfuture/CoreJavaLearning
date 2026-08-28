package com.src.interview;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java is a beautiful language and spring is the backbone of java";
		Set<String> set = new HashSet<>();
		String output = Arrays.stream(str.split(" "))
			.filter(n -> set.add(n))
			.collect(Collectors.joining(" "));
		System.out.println(output);
	}

}
