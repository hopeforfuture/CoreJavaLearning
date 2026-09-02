package com.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>(Arrays.asList("Java", "Spring"));
		list1.set(1, "Spring Boot");
		for(String s : list1) {
			System.out.println(s);
		}
	}

}
