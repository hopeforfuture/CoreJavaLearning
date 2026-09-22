package com.src.partioning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.code.common.Employee;

public class SalaryPartioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> workers = Arrays.asList(
			    new Employee(1, "Amit", "IT", 80000),
			    new Employee(2, "Rahul", "HR", 50000),
			    new Employee(3, "Priya", "IT", 90000),
			    new Employee(4, "Neha", "Finance", 60000),
			    new Employee(5, "Ravi", "HR", 75000)
			);
		
		Map<Boolean, List<Employee>> mapData = workers.stream()
				.collect(Collectors.partitioningBy(e -> e.getSalary() > 50000));
		System.out.println("Total employee count for salary > 50000: " + mapData.get(true).size());
		for(Employee e : mapData.get(true)) {
			System.out.println("Name: " + e.getName() + " Salary: " + e.getSalary());
		}
		
		Map<Boolean, Long> mapDataTwo = workers.stream()
				.collect(Collectors.partitioningBy(e->e.getSalary() > 50000, Collectors.counting()));
		
		System.out.println(mapDataTwo);
		
		Map<Boolean, List<String>> mapDataThree = workers.stream()
				.collect(Collectors.partitioningBy(w -> w.getSalary()> 50000, Collectors.mapping(Employee::getName, Collectors.toList())));
		
		for(var e : mapDataThree.get(true)) {
			System.out.println(e);
		}
		
		Map<Boolean, String> mapDataFour = workers.stream()
				.collect(Collectors.partitioningBy(w -> w.getSalary() > 50000, Collectors.mapping(Employee::getName, Collectors.joining(", "))));
		System.out.println(mapDataFour.get(true));
	}

}
