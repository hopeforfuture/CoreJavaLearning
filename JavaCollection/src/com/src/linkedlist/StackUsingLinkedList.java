package com.src.linkedlist;
import java.util.*;

public class StackUsingLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> stack = new LinkedList<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println("Initial elements in stack: " + stack);
		System.out.println("Pop element from stack: " + stack.pop());
		System.out.println("Final elements in stack: " + stack);
	}

}
