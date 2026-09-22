package com.src.interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.src.common.Worker;

public class SortBySalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Worker> workers = Arrays.asList(
	            new Worker(1, "John", 50000),
	            new Worker(2, "Alice", 70000),
	            new Worker(3, "Bob", 40000),
	            new Worker(4, "David", 60000)
	        );
		
		Collections.sort(
			    workers,
			    Comparator.comparingDouble(Worker::getSalary).reversed()
			);
		
		for(var w : workers) {
			System.out.println("Id: " + w.getId() + " Name: " + w.getName() + " Salary: " + w.getSalary());
		}
		
		System.out.println("Highest Salary: " + workers.get(0).getSalary());
		
		System.out.println("-----------------------------------");
		
		List<Worker> sortedWorkers = workers.stream()
			.sorted(Comparator.comparingDouble(Worker::getSalary).reversed())
			.toList();
		System.out.println(sortedWorkers);
		
	}

}
