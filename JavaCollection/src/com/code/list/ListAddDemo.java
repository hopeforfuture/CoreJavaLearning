package com.code.list;

import java.util.ArrayList;
import java.util.List;

public class ListAddDemo {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Spring");
		al.add(1, "Spring Boot");
		
		for(String s : al) {
			System.out.println(s);
		}
	}
}
