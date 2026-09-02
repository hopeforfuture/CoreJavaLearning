package com.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new ArrayList<>(Arrays.asList(110,-15,120,-25,35,75));
		list1.sort(Comparator.naturalOrder());
		for (Integer integer : list1) {
			System.out.println(integer);
		}
		list1.sort(Comparator.reverseOrder());
		System.out.println("-----Reverse order sorting-----");
		for (Integer integer : list1) {
			System.out.println(integer);
		}
	}

}
