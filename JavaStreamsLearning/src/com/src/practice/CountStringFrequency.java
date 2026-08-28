package com.src.practice;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CountStringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter any string: ");
			String input = sc.nextLine();
			String[] inputArr = input.split(" ");
			Map<String, Long> mapData =	Arrays.stream(inputArr)
				 .collect(Collectors.groupingBy(
						 	s -> s,
						 	Collectors.counting()
						 ));
			
			for(var e : mapData.entrySet()) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}
		}
	}

}
