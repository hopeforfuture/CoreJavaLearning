package com.src.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.code.common.Employee;

public class EmployeeMaxSalaryTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employess = Arrays.asList(
				new Employee(101, "Rajkumar", "QA", 70000),
				new Employee(102, "Raghav", "QA", 60000),
				new Employee(103, "Sukesh Avula", "Infrastructure", 65000),
				new Employee(104, "Manojit Nandi", "Developer", 55000),
				new Employee(105, "Rajni Sharma", "Developer", 72000)
			);
		Employee e =	employess.stream()
					.max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		
		System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Department: " + e.getDepartment() + " Salary: " + e.getSalary());
	}

}
