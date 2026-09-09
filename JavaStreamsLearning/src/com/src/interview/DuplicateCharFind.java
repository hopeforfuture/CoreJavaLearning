package com.src.interview;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateCharFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Character> set = new HashSet<Character>();
		String str = "programming";
		List<Character> result = str.chars()
				                          .mapToObj(i -> (char)i)
				                          .filter(ch -> !set.add(ch))
				                          .toList();
		
		for(char ch : result) {
			System.out.println(ch);
		}
	}

}
