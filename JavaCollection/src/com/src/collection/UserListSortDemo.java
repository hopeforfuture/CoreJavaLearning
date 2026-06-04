/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Manojit Nandi
 */
class Employee
{
    private int id;
    private int salary;
    
    public Employee(int id, int salary)
    {
        this.id = id;
        this.salary = salary;     
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }
    
}



public class UserListSortDemo {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1001, 10000));
        emp.add(new Employee(1002, 50000));
        emp.add(new Employee(1003, 30000));
        emp.add(new Employee(1004, 70000));
        emp.add(new Employee(1005, 45000));
        
        Collections.sort(emp, (o1, o2) -> {
            return o1.getSalary() > o2.getSalary() ? -1 : 1;
        });
        
        for(Employee e : emp) {
            System.out.println("Id: " + e.getId());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("--------------------");
        }
    }
}
