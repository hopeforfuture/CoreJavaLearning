package com.src.interview;
import java.util.*;

public class FirstUniqueElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intNums = new ArrayList<>(Arrays.asList(1,2,3,4,5,1,2,3,9,10,15,20,4,5,9));
		Map<Integer, Integer> mapData = new LinkedHashMap<>();
		
		for(int n : intNums) {
			mapData.put(n, mapData.getOrDefault(n, 0) + 1);
		}
		
		for(var e : mapData.entrySet()) {
			if(e.getValue() == 1) {
				System.out.println(e.getKey());
				break;
			}
		}
	}

}
