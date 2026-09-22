package com.src.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.code.common.Employee;

public class MaxSalaryByDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
				new Employee(101, "James", "IT", 1000),
				new Employee(102, "Patric", "IT", 2500),
				new Employee(103, "Andrew", "IT", 1500),
				new Employee(104, "Caddic", "Sales", 10000),
				new Employee(105, "Peter", "Sales", 15000),
				new Employee(106, "Thomas", "IT", 12000)
			);
		
		Map<String, Double> empData = employees.stream()
											   .collect(
													Collectors.groupingBy(
															Employee::getDepartment,
															Collectors.collectingAndThen(
																	Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)),
																	optional -> optional.get().getSalary()
															)
													 )   
											   );
		
		for(var e : empData.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		
	}

}
