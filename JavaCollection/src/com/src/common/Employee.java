package com.src.common;

public class Employee {
	
	private int id;
	private String name;
	private String department;
	private String subDepartment;
	private double salary;
	
	public Employee(int id, String name, String department, String subDepartment, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.subDepartment = subDepartment;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getSubDepartment() {
		return subDepartment;
	}

	public void setSubDepartment(String subDepartment) {
		this.subDepartment = subDepartment;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", subDepartment="
				+ subDepartment + ", salary=" + salary + "]";
	}

}
