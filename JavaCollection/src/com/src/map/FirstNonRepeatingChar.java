package com.src.map;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "programmingp";
		Map<Character, Integer> mapData = new LinkedHashMap<>();
		for(char ch : str.toCharArray()) {
			mapData.merge(ch, 1, Integer::sum);
		}
		
		for(var e : mapData.entrySet()) {
			if(e.getValue() == 1) {
				System.out.println(e.getKey());
				break;
			}
		}
	}

}
