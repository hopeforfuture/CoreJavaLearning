package com.src.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class StackFromList {
	
	public static void printList(Deque<Integer> deque) {
		for(Integer i : deque) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> deque = new LinkedList<>();
		deque.push(10);
		deque.push(15);
		deque.push(20);
		deque.push(30);
		
		System.out.println("Initial contents of statck: ");
		printList(deque);
		Integer i = deque.pop();
		System.out.println("Element popped: " + i);
		System.out.println("Final contents of statck: ");
		printList(deque);
	}

}
