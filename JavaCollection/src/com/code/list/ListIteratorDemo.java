package com.code.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> languages = new ArrayList<>(Arrays.asList("Java", "Python", "C#", "React"));
		System.out.println("Before removal list is: " + languages);
		Iterator<String> listIterator = languages.iterator();
		while(listIterator.hasNext()) {
			if(listIterator.next().equalsIgnoreCase("react")) {
				listIterator.remove();
			}
		}
		System.out.println("After removal list is: " + languages);
	}

}
