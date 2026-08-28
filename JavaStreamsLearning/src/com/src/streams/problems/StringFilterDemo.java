package com.src.streams.problems;
import java.util.List;
import java.util.Arrays;

public class StringFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Manojit", "Avik", "Rahul", "Ayan", "Anik", "Jayant");
		
		List<String> filteredStrings = names.stream()
											.filter(n -> n.startsWith("A"))
											.toList();
		
		for(String s : filteredStrings) {
			System.out.println(s);
		}
	}

}
