package com.src.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueByList {
	
	public static void printList(Queue<String> queue) {
		for(String q : queue) {
			System.out.println(q);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<>();
		queue.add("Java");
		queue.add("Spring");
		queue.add("Python");
		queue.add("Oracle");
		System.out.println("Initial contents of queue: ");
		printList(queue);
		queue.offer("AWS");
		System.out.println("Final contents of queue: ");
		printList(queue);
		String s = queue.peek();
		System.out.println("Element picked: " + s);
		System.out.println("Contents of queue after peek: ");
		printList(queue);
		s = queue.poll();
		System.out.println("Element polled: " + s);
		System.out.println("Contents of queue after peek: ");
		printList(queue);
	}

}
