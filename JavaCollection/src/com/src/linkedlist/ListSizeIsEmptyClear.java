package com.src.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ListSizeIsEmptyClear {
	
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
		System.out.println("Initial list: ");
		printList(techstacks);
		System.out.println("Initial size of tech stack: " + techstacks.size());
		System.out.println("Techstack is empty: " + techstacks.isEmpty());
		techstacks.clear();
		System.out.println("List is made empty.");
		System.out.println("Techstack is empty: " + techstacks.isEmpty());
	}

}
