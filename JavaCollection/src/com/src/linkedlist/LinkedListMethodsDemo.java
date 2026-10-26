package com.src.linkedlist;
import java.util.*;

public class LinkedListMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> linkedListDemo = new LinkedList<>();
		linkedListDemo.add(10);
		linkedListDemo.add(20);
		linkedListDemo.add(30);
		linkedListDemo.add(1, 15);
		
		System.out.println("List: " + linkedListDemo);
		
		linkedListDemo.addFirst(5);
		linkedListDemo.addLast(40);
		
		System.out.println("List: " + linkedListDemo);
		
		//Retrieving elements
		System.out.println("Element at position 2 : " + linkedListDemo.get(2));
		System.out.println("First element: " + linkedListDemo.getFirst());
		System.out.println("Last element: " + linkedListDemo.getLast());
		
		//Updating element
		linkedListDemo.set(1, 100);
		System.out.println("List: " + linkedListDemo);
		
		//Checking elements
		System.out.println("20 contains in the list: " + linkedListDemo.contains(20));
		System.out.println(linkedListDemo.indexOf(20));
		System.out.println("Size of the list: " + linkedListDemo.size());
		
		//Removing elements
		linkedListDemo.removeFirst();
		linkedListDemo.removeLast();
		linkedListDemo.remove(Integer.valueOf(100));
		System.out.println("List: " + linkedListDemo + " Size: " + linkedListDemo.size());
		
		System.out.println("List is empty: " + linkedListDemo.isEmpty());
		linkedListDemo.clear();
		System.out.println("List is empty: " + linkedListDemo.isEmpty());
		
	}

}
