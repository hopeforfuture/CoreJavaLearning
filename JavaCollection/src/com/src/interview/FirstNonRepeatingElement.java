package com.src.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(10,20,20,10,30,40,50,30,40);
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(Integer n : nums) {
			map.put(n, Collections.frequency(nums, n));
		}
		
		for(var e : map.entrySet()) {
			if(e.getValue() == 1) {
				System.out.println("First non repeating element: " + e.getKey());
			}
		}
	}

}
