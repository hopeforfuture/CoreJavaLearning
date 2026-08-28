package com.src.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.code.common.Employee;

public class SortEmployeesBySalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
				new Employee(101, "Manojit", "IT", 20000),
				new Employee(102, "Rajni", "IT", 35000),
				new Employee(103, "Sanket", "IT", 10000),
				new Employee(104, "Bharath", "Operations", 20000),
				new Employee(105, "Mahesh", "Operations", 37000)
			);
		
		List<Employee> sortedEmployees = employees.stream()
								.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
								.toList();
		
		for(var e : sortedEmployees) {
			System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Department: " + e.getDepartment()
			+ " Salary: " + e.getSalary());
		}
	}

}
