package com.code.list;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ListPracticeDemo {
	
	public static void printList(List<Integer> nums) {
		System.out.println("Size of the list: " + nums.size());
		Iterator<Integer> iterator = nums.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listNums = new ArrayList<>(Arrays.asList(1,2,3,4,1,0,-2,9,3,90,34,23,21,21));
		Set<Integer> set = new LinkedHashSet<>(listNums);
		List<Integer> uniqueNums = new ArrayList<>(set);
		uniqueNums.sort(Comparator.naturalOrder());
		
		System.out.println("Initials elements in the list: ");
		printList(listNums);
		System.out.println("Final elements in the list: ");
		printList(uniqueNums);
		
		System.out.println("---------------------------------------------");
		List<Integer> nums1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,12,21,23,32,43,34));
		System.out.println("Initial elements in the list: ");
		printList(nums1);
		nums1.removeAll(Arrays.asList(32,34,5));
		System.out.println("Final elements in the list after removal: ");
		printList(nums1);
		nums1.retainAll(Arrays.asList(2,4,8,9,12,21));
		System.out.println("Final elements in the list after retaining elements: ");
		printList(nums1);
	}

}
