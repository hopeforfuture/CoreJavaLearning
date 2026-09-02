package com.code.list;

import java.util.Arrays;
import java.util.List;

public class ListContainsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = Arrays.asList("Java", "Spring", "Spring Boot", "Mysql");
		String s = "Spring";
		
		if(list1.contains(s)) {
			System.out.println(list1 + " contains " + s);
		} else {
			System.out.println(list1 + " does not contain " + s);
		}
	}

}
