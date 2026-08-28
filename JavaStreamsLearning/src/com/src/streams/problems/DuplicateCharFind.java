package com.src.streams.problems;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class DuplicateCharFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Character> set = new HashSet<Character>();
		String str = "programming";
		List<Character> duplicates = str.chars()
										.mapToObj(c -> (char)c)
										.filter(ch -> !set.add(ch))
										.toList();
		
		for(char ch : duplicates) {
			System.out.println(ch);
		}
	}

}
