package com.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListContainsAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>(Arrays.asList("Java", "Spring", "Spring boot", "MySql"));
		List<String> list2 = new ArrayList<>(Arrays.asList("Java", "Spring"));
		
		System.out.println(list1 + " contains " + list2 + " : " + list1.containsAll(list2));
	}

}
