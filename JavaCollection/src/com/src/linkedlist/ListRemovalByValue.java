package com.src.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ListRemovalByValue {
	
	public static void printList(List<Integer> list) {
		for(Integer i : list) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.addFirst(25);
		list.addLast(30);
		System.out.println("Initial list contains: ");
		printList(list);
		list.remove(Integer.valueOf(20));
		System.out.println("Final list contains: ");
		printList(list);
	}

}
