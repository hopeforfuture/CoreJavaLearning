package com.src.streams.problems;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharCountingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Please enter a string: ");
			String str = sc.nextLine();
			Map<Character, Long> map = str.chars()
					.mapToObj(c -> (char)c)
					.collect(Collectors.groupingBy(
								Function.identity(),
								Collectors.counting()
							));
			
			for(var e : map.entrySet()) {
				System.out.println(e.getKey() + " : " + e.getValue());
			}
		}

	}

}
