package com.src.linkedlist;

import java.util.LinkedList;

public class ListRemoveDemo {
	
	public static void printList(LinkedList<String> languages) {
		for(String s : languages) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.add("Java");
		list.add("Spring");
		list.add("Python");
		list.addFirst("AWS");
		list.addLast("React");
		
		System.out.println("Initial list contains: ");
		printList(list);
		list.removeFirst();
		System.out.println("After removing first element list becomes: ");
		printList(list);
		list.removeLast();
		System.out.println("After removing last element list becomes: ");
		printList(list);
		list.remove("Spring");
		System.out.println("After removing specific element list becomes: ");
		printList(list);
	}

}
