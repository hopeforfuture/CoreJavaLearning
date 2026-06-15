/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.map;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Manojit Nandi
 */
public class EmployeeSalaryDemo {
    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(10000, 15000, 20000, 25000, 28000);
        
        salaries.stream().map(salary -> salary * 1.1).forEach(salary -> System.out.printf("%.2f%n", salary));
    }
}
