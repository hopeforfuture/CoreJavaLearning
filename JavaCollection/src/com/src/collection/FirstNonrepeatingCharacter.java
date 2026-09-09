package com.src.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonrepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter any string: ");
			String str = sc.nextLine();
			Map<Character, Integer> mapData = new HashMap<>();
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

}
