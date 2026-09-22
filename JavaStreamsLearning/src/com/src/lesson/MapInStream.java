package com.src.lesson;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.code.common.Employee;

public class MapInStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> workers = Arrays.asList(
			    new Employee(1, "Amit", "IT", 80000),
			    new Employee(2, "Rahul", "HR", 50000),
			    new Employee(3, "Priya", "IT", 90000),
			    new Employee(4, "Neha", "Finance", 60000),
			    new Employee(5, "Ravi", "HR", 75000)
			);
		
		String groupEmployees = workers.stream()
										.filter(w -> w.getSalary() > 50000)
										.map(Employee::getName)
										.collect(Collectors.joining(", ", "[", "]"));
		
		System.out.println(groupEmployees);

	}

}
