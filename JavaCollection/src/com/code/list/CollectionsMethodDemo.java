package com.code.list;
import java.util.*;

public class CollectionsMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = new ArrayList<>(Arrays.asList(1,52,3,54,5,6,7,1,2,-10,43,21,32,55,4,2));
		Collections.sort(nums);
		System.out.println("Original list: " + nums);
		Collections.reverse(nums);
		System.out.println("Reverse list: " + nums);
		Collections.shuffle(nums);
		System.out.println("List after shuffled: " + nums);
		System.out.println("Min element: " + Collections.min(nums));
		System.out.println("Max Element: " + Collections.max(nums));
		Collections.sort(nums);
		System.out.println("Original list: " + nums);
		System.out.println("Element 30 in the list: " + Collections.binarySearch(nums, 7));
		System.out.println("Frequency of 2 in the list: " + Collections.frequency(nums, 2));
	}

}
