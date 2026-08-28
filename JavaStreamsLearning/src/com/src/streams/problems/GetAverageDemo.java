package com.src.streams.problems;
import java.util.List;
import java.util.Arrays;

public class GetAverageDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10, 15, 20,34,56,76);
		double average = numbers.stream()
		         		.mapToInt(i -> i)
		         		.average()
		         		.getAsDouble();
		         
	    System.out.println(average);	         

	}

}
