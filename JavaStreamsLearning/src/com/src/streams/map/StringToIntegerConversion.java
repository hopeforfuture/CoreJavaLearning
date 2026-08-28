package com.src.streams.map;
import java.util.List;
import java.util.Arrays;

public class StringToIntegerConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strNums = Arrays.asList("1", "2", "3", "4", "5");
		List<Integer> numsList = strNums.stream()
										.map(c -> Integer.valueOf(c))
										.toList();
		
		numsList.forEach(System.out::println);
	}

}
