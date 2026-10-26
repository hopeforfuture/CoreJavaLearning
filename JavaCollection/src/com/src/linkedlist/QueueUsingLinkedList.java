package com.src.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		
		System.out.println("Elements in queue: " + queue);
		System.out.println("Poll item from queue: " + queue.poll());
		System.out.println("Elements in queue: " + queue);
	}

}
