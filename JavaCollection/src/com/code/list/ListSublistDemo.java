package com.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSublistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> technologies = new ArrayList<>(Arrays.asList("Java", "Spring", "Spring Boot", "Mysql", "AWS", "React"));
		List<String> techStack = technologies.subList(1, 4);
		for(String s : techStack) {
			System.out.println(s);
		}
	}

}
