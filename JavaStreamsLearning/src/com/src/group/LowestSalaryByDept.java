package com.src.group;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.code.common.Employee;

public class LowestSalaryByDept {

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
		
		Map<String, Double>	mapData = employees.stream()
						.collect(Collectors.groupingBy(
									Employee::getDepartment,
									Collectors.collectingAndThen( 
											Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)),
											employee -> employee.get().getSalary()
									)
								));
		
		for(var e : mapData.entrySet()) {
			System.out.print("Department: " + e.getKey());
			System.out.println(" Minimum Salary: " + e.getValue());
		}
	}

}
