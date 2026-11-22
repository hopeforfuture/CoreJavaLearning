package com.src.practicetwo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondHighestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(90, 78,12,34,45,-90,101,32,65,21,120,69,120);
		System.out.println(numbers.stream()
				                  .distinct()
				                  .sorted(Comparator.reverseOrder())
				                  .skip(1)
				                  .findFirst()
				                  .orElse(null)
				);
	}

}
