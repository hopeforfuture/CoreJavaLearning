package com.src.partioning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.code.common.Employee;

public class PartionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> workers = Arrays.asList(
			    new Employee(1, "Amit", "IT", 80000),
			    new Employee(2, "Rahul", "HR", 50000),
			    new Employee(3, "Priya", "IT", 30000),
			    new Employee(4, "Neha", "Finance", 60000),
			    new Employee(5, "Ravi", "HR", 75000)
			);
		
		Map<Boolean, Long> mapDataOne = workers.stream()
											   .collect(Collectors.partitioningBy(w -> w.getSalary() > 50000, Collectors.counting()));
		
		System.out.println("Number of emolyees having salary more than 50000 : " + mapDataOne.get(true));
		
		Map<Boolean, List<Employee>> mapDataTwo = workers.stream()
				                                          .collect(Collectors.partitioningBy(w -> w.getSalary() > 50000));
		
		for(var e : mapDataTwo.get(true)) {
			System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Department: " + e.getDepartment() + " Salary: " + e.getSalary());
		}
		
		Map<Boolean, String> mapDataThree = workers.stream()
				                                   .collect(Collectors.partitioningBy(w -> w.getSalary() > 50000, 
				                                		   Collectors.mapping(Employee::getName, Collectors.joining(", "))));
		
		System.out.println("List of employees having salary more than 50000: " + mapDataThree.get(true));
	}

}
