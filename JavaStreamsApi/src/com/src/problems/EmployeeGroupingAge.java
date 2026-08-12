/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Map;

class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    
}

/**
 *
 * @author Manojit Nandi
 */
public class EmployeeGroupingAge {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Manojit", 39),
                new Employee(2, "Sanjay", 29),
                new Employee(3, "Avik", 35),
                new Employee(4, "Pranoy", 39),
                new Employee(5, "Sanket", 35),
                new Employee(6, "Lokesh", 28),
                new Employee(7, "Umesh", 29)
        );
        
       Map<Integer, List<Employee>> groupedEmployees = employees.stream()
                .collect(Collectors.groupingBy(Employee::getAge));
       
       for(var e : groupedEmployees.entrySet()) {
           System.out.println("Age: " + e.getKey());
           for(Employee emp : e.getValue()) {
               System.out.println("Id: " + emp.getId() + " Name: " + emp.getName());
           }
           System.out.println("-----------------------------------------------------------------------------");
       }
               
        
    }
}
