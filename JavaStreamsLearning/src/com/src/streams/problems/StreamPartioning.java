package com.src.streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.code.common.Employee;

public class StreamPartioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> workers = Arrays.asList(
			    new Employee(1, "Amit", "IT", 80000),
			    new Employee(2, "Rahul", "HR", 50000),
			    new Employee(3, "Priya", "IT", 90000),
			    new Employee(4, "Neha", "Finance", 60000),
			    new Employee(5, "Ravi", "HR", 75000)
			);
		
		Map<Boolean, List<Employee>> mapDataOne = workers.stream()
														 .collect(Collectors.partitioningBy(e -> e.getSalary() > 50000));
		System.out.println("Total no of employees having salary greater than 50000: " + mapDataOne.get(true).size());
		
		for(var e : mapDataOne.get(true)) {
			System.out.println(e.getId() + " : " + e.getName() + " Department: " + e.getDepartment() + " Salary: " + e.getSalary());
		}
	}

}
