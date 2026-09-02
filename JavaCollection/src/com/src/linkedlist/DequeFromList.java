package com.src.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class DequeFromList {
	
	public static void printList(Deque<Integer> deque) {
		for(Integer i : deque) {
			System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> deque = new LinkedList<>();
		deque.addFirst(10);
		deque.addLast(20);
		deque.addFirst(5);
		deque.addLast(30);
		System.out.println("Initial contents of deque: ");
		printList(deque);
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Final contents of deque after element removal: ");
		printList(deque);
		Integer i = deque.peekFirst();
		System.out.println("Element peeked: " + i);
		i = deque.peekLast();
		System.out.println("Element peeked: " + i);
		System.out.println("Final contents of deque after element peeked: ");
		printList(deque);
		i = deque.pollFirst();
		System.out.println("Element polled: " + i);
		System.out.println("Final contents of deque after element peeked: ");
		printList(deque);
		i = deque.pollLast();
		System.out.println("Element polled: " + i);
		System.out.println("Final contents of deque after element peeked: ");
		printList(deque);
	}

}
