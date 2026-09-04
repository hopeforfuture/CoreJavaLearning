package com.src.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		for(Employee e : employees) {
			mapData.computeIfAbsent(e.getDepartment(), key-> new HashMap<>())
				   .computeIfAbsent(e.getSubDepartment(), key -> new ArrayList<>())
				   .add(e);
		}
		
		//System.out.println(mapData);
		
		for(var es1 : mapData.entrySet()) {
			System.out.println("Department: " + es1.getKey());
			for(var es2 : es1.getValue().entrySet()) {
				System.out.println("Sub Department: " + es2.getKey());
				for(var e : es2.getValue()) {
					System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSalary());
				}
			}
			System.out.println("------------------");
		}
	}

}
