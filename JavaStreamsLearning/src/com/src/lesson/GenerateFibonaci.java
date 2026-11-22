package com.src.lesson;

import java.util.List;
import java.util.stream.Stream;

public class GenerateFibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intLists = Stream.iterate(
					new int[] {0,1},
					arr -> new int[] {arr[1], arr[0] + arr[1]}
				)
				.limit(10)
				.map(arr -> arr[1])
				.toList();
		for(int i : intLists) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

}
