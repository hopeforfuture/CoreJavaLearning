package com.src.practice;
import java.util.Arrays;
import java.util.List;

public class CommonElementsInTwoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList1 = Arrays.asList(1,2,3,4,5,6,7);
		List<Integer> intList2 = Arrays.asList(3,4,5,8,9);
		
		List<Integer> commonElements = intList1.stream()
										.filter(n -> intList2.contains(n))
										.toList();
		
		for(int n : commonElements) {
			System.out.println(n);
		}
	}

}
