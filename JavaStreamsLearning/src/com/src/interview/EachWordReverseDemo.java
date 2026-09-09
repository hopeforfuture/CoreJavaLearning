package com.src.interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class EachWordReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "my experiment with         truth";
		String output = Arrays.stream(str.split("\\s+"))
			  .map(word -> new StringBuilder(word).reverse().toString())
			  .collect(Collectors.joining(" "));
		
		System.out.println(output);
	}

}
