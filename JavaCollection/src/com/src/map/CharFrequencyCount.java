package com.src.map;

import java.util.HashMap;
import java.util.Map;

public class CharFrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programmingp";
		Map<Character, Integer> map = new HashMap<>();
		for(char ch : str.toCharArray()) {
			//map.merge(ch, 1, Integer::sum);
			map.merge(ch, 1, (a,b)->a+b);
		}
		
		System.out.println(map);
	}

}
