package com.src.lesson;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My experiment with           truth";
		String[] strarr = str.split("\\s+");
		String output = Stream.of(strarr)
							  .map(word -> new StringBuilder(word).reverse().toString())
							  .collect(Collectors.joining(" "));
		
		System.out.println(output);
	}

}
