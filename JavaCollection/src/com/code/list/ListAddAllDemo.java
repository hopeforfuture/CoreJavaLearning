package com.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListAddAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<>(Arrays.asList("Java", "Spring")) ;
		List<String> list2 = new ArrayList<>(Arrays.asList("React", "Node"));
		
		list1.addAll(list2);
		
		for(String s : list1) {
			System.out.println(s);
		}
	}

}
