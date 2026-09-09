package com.src.treemap;

import java.util.Comparator;
import java.util.TreeMap;

public class AdvancedTreeMapMethodsDemo {
	
	public static void printMap(TreeMap<Integer, String> map) {
		for(var e : map.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, String> map = new TreeMap<>(Comparator.naturalOrder());

		map.put(10, "A");
		map.put(20, "B");
		map.put(30, "C");
		map.put(40, "D");
		map.put(50, "E");
		
		printMap(map);
		System.out.println("First Key: " + map.firstKey());
		System.out.println("Last Key: " + map.lastKey());
		System.out.println("Higher Key of 10: " + map.higherKey(10));
		System.out.println("Lower Key of 30: " + map.lowerKey(30));
		System.out.println("Floor Key of 25: " + map.floorKey(25));
		System.out.println("Ceiling Key of 25: " + map.ceilingKey(25));
		System.out.println("Higher entry of 20: " + map.higherEntry(20));
		System.out.println("Lower entry of 40: " + map.lowerEntry(40));
		
		TreeMap<Integer, String> headMap = new TreeMap<>(map.headMap(30, true));
		System.out.println("Headmap of 30: ");
		printMap(headMap);
		
		TreeMap<Integer, String> tailMap = new TreeMap<>(map.tailMap(30));
		System.out.println("Tailmap of 30: ");
		printMap(tailMap);
		
		TreeMap<Integer, String> subMap = new TreeMap<>(map.subMap(20,false,50,true));
		System.out.println("Submap of 20 and 50: ");
		printMap(subMap);
	}

}
