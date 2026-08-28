package com.src.streams.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.code.common.Employee;

public class GroupEmployeeByDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employess = Arrays.asList(
					new Employee(101, "Rajkumar", "QA", 70000),
					new Employee(102, "Raghav", "QA", 60000),
					new Employee(103, "Sukesh Avula", "Infrastructure", 65000),
					new Employee(104, "Manojit Nandi", "Developer", 55000),
					new Employee(105, "Rajni Sharma", "Developer", 72000)
				);
		
		Map<String, List<Employee>> mapData = employess.stream()
						.collect(
							Collectors.groupingBy(Employee::getDepartment)	
						 );
		
		for(var e : mapData.entrySet()) {
			System.out.println(e.getKey());
			for(Employee emp : e.getValue()) {
				System.out.println("Id: " + emp.getId() + " Name: " + emp.getName() + " Salary: " + emp.getSalary());
			}
		}
	}

}
