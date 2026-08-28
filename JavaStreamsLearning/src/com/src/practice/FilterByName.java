package com.src.practice;
import java.util.List;
import java.util.Arrays;
import com.code.common.Employee;


public class FilterByName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees = Arrays.asList(
					new Employee(101, "Manojit", "IT", 20000),
					new Employee(102, "Rajni", "IT", 25000),
					new Employee(103, "Sanket", "IT", 10000),
					new Employee(104, "Bharath", "Operations", 20000),
					new Employee(105, "Mahesh", "Operations", 27000)
				);
		
		List<Employee> filteredEmployees = employees.stream()
													.filter(e -> e.getName().startsWith("M"))
													.toList();
		
		for(var e : filteredEmployees) {
			System.out.println("Id: " + e.getId() + " Name: " + e.getName() + " Department: " + e.getDepartment() 
			+ " Salary: " + e.getSalary());
		}
	}

}
