package com.src.lesson;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Character, Integer> mapData = new LinkedHashMap<>();
		String str = "swiss";
		
		for(char ch : str.toCharArray()) {
			mapData.put(ch, mapData.getOrDefault(ch, 0) + 1);
		}
		
		for(var e : mapData.entrySet()) {
			if(e.getValue() == 1) {
				System.out.println("First unique character: " + e.getKey());
				return;
			}
		}
		System.out.println("No unique character exists");
	}

}
