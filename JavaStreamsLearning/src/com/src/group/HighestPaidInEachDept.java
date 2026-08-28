package com.src.group;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.code.common.Employee;

public class HighestPaidInEachDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "James", "IT", 1000),
			    new Employee(102, "Patric", "IT", 2500),
			    new Employee(103, "Andrew", "IT", 1500),
			    new Employee(104, "Caddic", "Sales", 10000),
			    new Employee(105, "Peter", "Sales", 15000),
			    new Employee(106, "Thomas", "IT", 12000),
			    new Employee(107, "John", "HR", 5000),
			    new Employee(108, "David", "HR", 7000),
			    new Employee(109, "Robert", "Sales", 12000)
			);
		
		Map<String, Optional<Employee>> highestPaidEmployees = employees.stream()
																		.collect(Collectors.groupingBy(
																				Employee::getDepartment,
																				Collectors.maxBy(
																					Comparator.comparingDouble(Employee::getSalary)
																				)
																		));
		
		highestPaidEmployees.forEach((department, employee) -> {
			System.out.println("Department: " + department);
			employee.ifPresent(emp -> {
				System.out.println("Id: " + emp.getId() + " Name: " + emp.getName() + " Salary: " + emp.getSalary());
			});
		});
	}

}
