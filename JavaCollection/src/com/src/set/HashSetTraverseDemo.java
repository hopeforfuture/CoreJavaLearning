package com.src.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTraverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> languages = new HashSet<>();
		languages.add("Java");
		languages.add("Python");
		languages.add("Oracle");
		languages.add("Rect");
		
		Iterator<String> iterator = languages.iterator();
		System.out.println("HashSet contains: ");
		while(iterator.hasNext()) {
			String language = iterator.next();
			System.out.println(language);
		}
		System.out.println("HashSet length: " + languages.size());
		languages.clear();
		System.out.println("Hashset is empty: " + languages.isEmpty());
	}

}
