package com.src.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListAddFirstLastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> languages = new LinkedList<>(Arrays.asList("Java", "Node"));
		System.out.println("Initial list content: " + languages);
		languages.addFirst("Spring");
		languages.addLast("React");
		languages.addAll(1, Arrays.asList("Oracle", "Mysql", "AWS"));
		System.out.println("Final list content: " + languages);
	}

}
