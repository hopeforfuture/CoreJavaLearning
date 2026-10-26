package com.src.revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.code.common.Employee;

public class EmployeeMaxSalaryDepartment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
					new Employee(101, "Alice", "IT", 500),
					new Employee(102, "Jack", "IT", 400),
					new Employee(103, "Stweart", "HR", 700),
					new Employee(104, "Clerk", "HR", 900)
				);
		
		Map<String, Optional<Employee>> mapData = employees.stream()
														   .collect(Collectors.groupingBy(
																   	Employee::getDepartment,
																   	Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))
																   ));
		
		mapData.forEach((dept, emp) -> {
			System.out.print("Department: " + dept + " ");
			emp.ifPresent(e -> {
				System.out.println("Max Salary: " + e.getSalary());
			});
		});
	}

}
