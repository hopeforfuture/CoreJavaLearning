package com.src.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapCreateDemo {
	
	public static void printMap(Map<Integer, String> map) {
		for(Map.Entry<Integer, String> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey() + " --------> " + entrySet.getValue());
		}
	}
	
	public static void printMapTwo(Map<Integer, String> map) {
		System.out.println("Iterate over map using keySet");
		for(Integer key : map.keySet()) {
			System.out.println(key + " --------> " + map.get(key));
		}
	}
	
	public static void printMapThree(Map<Integer, String> map) {
		System.out.println("Iterate over map using forEach");
		map.forEach((key, value) -> {
			System.out.println(key + " ------> " + value);
		});
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "Alex");
		map.put(102, "John");
		map.put(103, "Cairns");
		map.putIfAbsent(104, "Parno");
		
		System.out.println("Contents of Map: ");
		printMap(map);
		
		System.out.println("Value at key 104: " + map.get(104));
		System.out.println("Value at key 105: " + map.getOrDefault(105, "-"));
		System.out.println("key 102 exists: " + map.containsKey(102));
		System.out.println("Value Symonds exists: " + map.containsValue("Symonds"));
		
		map.remove(103);
		System.out.println("Contents of Map after deletion: ");
		printMap(map);
		
		map.remove(102, "John");
		System.out.println("Trying to remove entry based on key/value pair");
		System.out.println("Contents of Map after deletion: ");
		printMap(map);
		
		map.replace(104, "Warne");
		map.putIfAbsent(105, "Stuart");
		map.putIfAbsent(106, "Gaugh");
		System.out.println("Contents of Map after value update: ");
		printMap(map);
		System.out.println("Size of map: " + map.size());
		printMapTwo(map);
		
		printMapThree(map);
	}

}
