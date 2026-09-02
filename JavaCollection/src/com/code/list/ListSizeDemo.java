package com.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListSizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>(Arrays.asList("Java", "Spring", "Spring boot", "MySql"));
		System.out.println(list1 + " total length: " + list1.size());
	}

}
