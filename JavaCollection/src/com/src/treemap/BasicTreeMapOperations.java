package com.src.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class BasicTreeMapOperations {
	
	public static void printMap(Map<Integer, String> data) {
		for(var e : data.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> mapData = new TreeMap<>(Comparator.reverseOrder());
		mapData.put(20, "Alex");
		mapData.put(10, "Dravid");
		mapData.put(100, "Peter");
		mapData.put(70, "John");
		mapData.put(40, "Harris");
		
		printMap(mapData);
		System.out.println("Entry at key 10: " + mapData.get(10));
		mapData.remove(70);
		System.out.println("Contents of map after removal");
		printMap(mapData);
		System.out.println("Key 70 exists in map: " + mapData.containsKey(70));
		System.out.println("Value Peter exists in map: " + mapData.containsValue("Peter"));
		System.out.println("Size of Map: " + mapData.size());
		mapData.clear();
		System.out.println("Map is clear or not: " + mapData.isEmpty());
	}

}
