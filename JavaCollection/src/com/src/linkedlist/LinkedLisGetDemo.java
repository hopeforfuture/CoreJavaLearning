package com.src.linkedlist;

import java.util.LinkedList;

public class LinkedLisGetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("Java");
		list.add("Spring");
		list.add("Python");
		list.addFirst("AWS");
		list.addLast("React");
		
		System.out.println("First element: " + list.getFirst());
		System.out.println("Last element: " + list.getLast());
		System.out.println("Element at 1 index: " + list.get(1));
		
	}

}
