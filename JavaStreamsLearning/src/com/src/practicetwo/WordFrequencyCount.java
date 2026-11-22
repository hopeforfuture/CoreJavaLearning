package com.src.practicetwo;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordFrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("Please enter any string: ");
			String str = sc.nextLine();
			String[] inputArr = str.split(" ");
		    Map<String, Long> resultArr =	Arrays.stream(inputArr)
				 .collect(Collectors.groupingBy(
						 	s -> s,
						 	Collectors.counting()
						 ));
		    
		    for(var e : resultArr.entrySet()) {
		    	System.out.println(e.getKey() + " : " + e.getValue());
		    }
				 
		}
	}

}
