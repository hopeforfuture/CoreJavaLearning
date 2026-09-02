package com.src.linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortLinkedListDemo {
	
	public static void printList(List<Integer> list) {
		for(Integer i : list) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>(Arrays.asList(90,35,-55,67,12,31,-190,75,10));
		System.out.println("Initial list contents: ");
		printList(list);
		Collections.sort(list);
		System.out.println("Sorted list contents: ");
		printList(list);
		Collections.reverse(list);
		System.out.println("Reversed list contents: ");
		printList(list);
	}

}
