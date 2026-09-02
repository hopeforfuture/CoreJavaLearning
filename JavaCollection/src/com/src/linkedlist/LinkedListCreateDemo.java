package com.src.linkedlist;

import java.util.LinkedList;

public class LinkedListCreateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> languages = new LinkedList<>();
		languages.add("Java");
		languages.add("Spring");
		languages.add("React");
		
		for(String s : languages) {
			System.out.println(s);
		}
	}

}
