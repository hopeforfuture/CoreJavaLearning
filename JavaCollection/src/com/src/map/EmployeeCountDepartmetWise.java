package com.src.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.src.common.Employee;

public class EmployeeCountDepartmetWise {

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
		
		Map<String, Map<String, Integer>> mapData = new HashMap<>();
		
		for(var e : employees) {
			mapData.computeIfAbsent(e.getDepartment(), k -> new HashMap<>())
				   .merge(e.getSubDepartment(), 1, Integer::sum);
		}
		
		System.out.println(mapData);
		
		for(var deptData : mapData.entrySet()) {
			System.out.println("Department: " + deptData.getKey());
			for(var subDeptData : deptData.getValue().entrySet()) {
				System.out.println("Sub Department: " + subDeptData.getKey() + " Employee Count: " + subDeptData.getValue());
			}
		}
	}

}
