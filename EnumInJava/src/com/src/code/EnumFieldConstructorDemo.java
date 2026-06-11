/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;

/**
 *
 * @author Manojit Nandi
 */
enum EmployeeType {
    
    MANAGER(100000),
    DEVELOPER(70000),
    TESTER(75000);
    
    private int salary;
    
    EmployeeType(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
    
}
public class EnumFieldConstructorDemo {
    public static void main(String[] args) {
        EmployeeType manager = EmployeeType.MANAGER;
        
        System.out.println("Manager salary: " + manager.getSalary());
        System.out.println("--------Printing Salary of Employees------------");
        EmployeeType emp[] = EmployeeType.values();
        for(EmployeeType e : emp) {
            System.out.println(e + " " + e.getSalary());
        }
    }
}
