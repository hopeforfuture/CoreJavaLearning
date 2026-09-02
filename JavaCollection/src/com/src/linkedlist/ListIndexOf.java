package com.src.linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class ListIndexOf {
	
	public static void printList(LinkedList<String> languages) {
		for(String s : languages) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> languages = new LinkedList<>(Arrays.asList("Java", "Node"));
		languages.addFirst("Spring");
		languages.addLast("React");
		languages.addAll(Arrays.asList("Oracle", "AWS", "Azure", "Mongodb", "Java"));
		
		System.out.println("Original list contains: ");
		printList(languages);
		System.out.println("Index of Java in the list: " + languages.indexOf("Java"));
		System.out.println("Last Index of Java in the list: " + languages.lastIndexOf("Java"));
	}

}
