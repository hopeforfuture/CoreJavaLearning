/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
class Employee {
    private int id;
    private String name;
    private double salary;
    
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }
    
}

public class FilterObjectDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(101, "empA", 70000),
                new Employee(102, "empB", 50000),
                new Employee(103, "empC", 30000),
                new Employee(104, "empD", 250000),
                new Employee(105, "empE", 60000),
                new Employee(106, "empF", 55000)
        );
        
        
        List<Employee> filteredEmployees = employees.stream().filter(emp -> emp.getSalary() > 30000).collect(Collectors.toList());
        System.out.println("List of employees having salary more than 30000");
        
        for(var e : filteredEmployees) {
            System.out.println("ID: " + e.getId() + " Name: " + e.getName() + " Salary: " + e.getSalary());
        }
    }
}
