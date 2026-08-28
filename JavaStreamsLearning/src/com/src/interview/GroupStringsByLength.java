package com.src.interview;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Arrays;

public class GroupStringsByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Patric", "Andrew", "James", "Peter", "Kevin", "Alex", "Harry");
		Map<Integer, String> result =	names.stream()
			.collect(Collectors.groupingBy(
						String::length,
						Collectors.joining(", ")
					));
		
		for(var e : result.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
			
		}
	}

}
