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
		Deque<Integer> stack = new LinkedList<>();
		stack.push(10);
		stack.push(15);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Initial contents of statck: ");
		printList(stack);
		Integer i = stack.pop();
		System.out.println("Element popped: " + i);
		System.out.println("Final contents of statck: ");
		printList(stack);
	}

}
