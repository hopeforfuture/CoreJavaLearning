package com.src.collection;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.src.common.Employee;

public class GroupEmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
				new Employee(101, "Manojit", "IT", "Development", 20000),
				new Employee(102, "Rajni", "IT", "Development", 25000),
				new Employee(103, "Sanket", "IT", "Infrastructure", 10000),
				new Employee(106, "Sukesh", "IT", "Infrastructure", 19000),
				new Employee(104, "Bharath", "Operations", "Communicaion", 18000),
				new Employee(105, "Mahesh", "Operations", "Communicaion", 27000),
				new Employee(107, "Hansa", "Operations", "Business", 25000)
			);
		
		Map<String, Map<String, List<Employee>>> mapData = new HashMap<>();
		
		for(var e : employees) {
			mapData.computeIfAbsent(e.getDepartment(), k -> new HashMap<>())
				   .computeIfAbsent(e.getSubDepartment(), k-> new ArrayList<>())
				   .add(e);
		}
		
		mapData.forEach((dept, empDeptData) -> {
			System.out.println("Department: " + dept);
			empDeptData.forEach((subdept, employeeAccumulated) -> {
				System.out.println("Sub Department: " + subdept);
				for(var e : employeeAccumulated) {
					System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSalary());
				}
				System.out.println("--------------------------");
			});
		});
	}

}
