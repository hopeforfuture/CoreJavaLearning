package com.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class ListRemovesDuplicatesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(10,20,30,10,30,40,50,55,10);
		List<Integer> uniqueLists = new ArrayList<>(new LinkedHashSet<>(numbers));
		for(int i : uniqueLists) {
			System.out.println(i);
		}
	}

}
