package com.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIndexOfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>(Arrays.asList("Java", "Spring", "Spring Boot", "Java"));
		String s = "Java";
		System.out.println("Position of " + s + " in " + list1 + " : " + list1.indexOf("Java"));
		System.out.println("Last Position of " + s + " in " + list1 + " : " + list1.lastIndexOf("Java"));
	}

}
