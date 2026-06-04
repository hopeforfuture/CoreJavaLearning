/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
public class EncapsulationDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEmpId(101);
        e1.setEmpName("Ramesh");
        
        System.out.println("Employee ID: " + e1.getEmpId() + " Employee Name: " + e1.getEmpName());
    }
}
