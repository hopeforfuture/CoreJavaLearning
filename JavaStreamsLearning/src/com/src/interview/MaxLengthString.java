package com.src.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MaxLengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "exploring spring framework with the help of udemy courses";
		String str1 = Arrays.stream(str.split(" "))
			  .collect(
					Collectors.maxBy(Comparator.comparingInt(String::length)) 
			  ).get();
		
		System.out.println(str1);
	}

}
