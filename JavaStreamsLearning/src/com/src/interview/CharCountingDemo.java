package com.src.interview;

import java.util.Map;
import java.util.stream.Collectors;

public class CharCountingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programming";
		Map<Character, Long> mapData = str.chars()
										  .mapToObj(i -> (char)i)
										  .collect(Collectors.groupingBy(
												  	s -> s,
												  	Collectors.counting()
												  ));
		
		for(var e : mapData.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

}
