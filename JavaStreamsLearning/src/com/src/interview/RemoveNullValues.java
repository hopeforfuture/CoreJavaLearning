package com.src.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNullValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intLists = Arrays.asList(10,-90, null, 101,34,21,-15,65,34,-90, null);
	    List<Integer> nonNullValues =	intLists.stream()
				.filter(n -> n != null)
				.toList();
	    
	    for(int n : nonNullValues) {
	    	System.out.println(n);
	    }
	}

}
