package com.src.streams.problems;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountStringFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Core java and java spring boot spring mvc";
		Map<String, Long> mapData = Arrays.stream(str.split(" "))
										.collect(
												Collectors.groupingBy(
														s->s,
														Collectors.counting()
												)
										);
		
		for(var e : mapData.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}
									   
	}

}
