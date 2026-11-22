package com.src.lesson;

import java.util.List;
import java.util.stream.Collectors;

public class ListNameConcatenate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = List.of("Manojit", "Supriyo", "Binoy", "Raj", "Jayadeep");
		String output = names.stream()
				             .collect(Collectors.joining(", "));
		System.out.println(output);
	}

}
