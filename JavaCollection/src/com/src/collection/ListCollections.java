package com.src.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Java", "Python", "Oracle", "React", "Java");
		System.out.println("Original List: " + list);
		System.out.println(Collections.frequency(list, "Java"));
		Collections.swap(list, 0, 2);
		System.out.println("List after swap: " + list);
		Collections.sort(list);
	}

}
