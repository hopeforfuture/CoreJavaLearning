package com.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRetainAllDemo {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>(Arrays.asList("Java", "Spring", "Oracle", "Aws"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Oracle", "Spring"));
		
		list1.retainAll(list2);
		
		for(String s : list1) {
			System.out.println(s);
		}
	}
}
