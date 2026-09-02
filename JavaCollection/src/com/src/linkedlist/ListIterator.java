package com.src.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListIterator {
	
	public static void printList(List<String> list) {
		for(String s : list) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> techstacks = new LinkedList<>();
		techstacks.add("Java");
		techstacks.add("Oracle");
		techstacks.addFirst("Spring");
		techstacks.addLast("AWS");
		System.out.println("Initial list contains: ");
		printList(techstacks);
		Iterator<String> iterator = techstacks.iterator();
		while(iterator.hasNext()) {
			String value = iterator.next();
			if(value.equalsIgnoreCase("Spring")) {
				iterator.remove();
			}
		}
		System.out.println("Final list contains: ");
		printList(techstacks);
	}

}
