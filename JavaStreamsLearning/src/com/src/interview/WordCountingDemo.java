package com.src.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "java full stack developer including java spring boot and spring data jpa";
		Map<String, Long> mapData = Arrays.stream(str.split("\\s+"))
					                      .collect(
					                         Collectors.groupingBy(
					                        	s -> s,
					                        	Collectors.counting()
					                         )		  
					                      );
		
		for(var e : mapData.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}

}
