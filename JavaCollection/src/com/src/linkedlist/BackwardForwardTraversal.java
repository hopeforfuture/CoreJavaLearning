package com.src.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class BackwardForwardTraversal {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> techstacks = new LinkedList<>();
		techstacks.add("Java");
		techstacks.add("Oracle");
		techstacks.addFirst("Spring");
		techstacks.addLast("AWS");
		
		ListIterator<String> iterator =  techstacks.listIterator();
		System.out.println("Forward Traversal: ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("Backward Traversal: ");
		while(iterator.hasPrevious()) {
			System.out.println(iterator.previous());
		}
	}

}
