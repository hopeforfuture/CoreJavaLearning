package com.src.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import com.code.common.Employee;

public class EmployeeSecondHighestSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
				new Employee(101, "Manojit", "IT", 20000),
				new Employee(102, "Rajni", "IT", 25000),
				new Employee(103, "Sanket", "IT", 10000),
				new Employee(104, "Bharath", "Operations", 18000),
				new Employee(105, "Mahesh", "Operations", 27000)
			);
		
	  Employee e =	employees.stream()
			.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
			.skip(1)
			.findFirst()
			.orElse(null);
	  
	  System.out.println(e.toString());
	}

}
