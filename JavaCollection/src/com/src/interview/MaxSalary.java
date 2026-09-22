package com.src.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.src.common.Worker;

public class MaxSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Worker> workers = Arrays.asList(
	            new Worker(1, "John", 50000),
	            new Worker(2, "Alice", 70000),
	            new Worker(3, "Bob", 40000),
	            new Worker(4, "David", 60000)
	        );
		
	    Worker w =	Collections.max(workers,
				Comparator.comparingDouble(Worker::getSalary)
		);
	    
	    System.out.println(w.getSalary());
	    
	    System.out.println("-------------Using Stream----------------");
	    Worker highestPaid = workers.stream()
	    							.max(Comparator.comparingDouble(Worker::getSalary))
	    							.orElse(null);
	    System.out.println("Highest Salary: " + highestPaid.getSalary());
		
	}

}
