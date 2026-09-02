package com.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListRemoveDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>(Arrays.asList("Java", "Spring", "Spring boot", "AWS"));
		list1.remove(1);
		list1.remove("AWS");
		
		for(String s : list1) {
			System.out.println(s);
		}
	}

}
