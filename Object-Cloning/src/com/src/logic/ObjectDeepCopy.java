/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
class Employee implements Cloneable
{
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + '}';
    }
    
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch(CloneNotSupportedException ex) {
            throw new Error("Something impossible just happened");
        }
    }
    
}

public class ObjectDeepCopy {
    public static void main(String[] args) {
        Employee e1 = new Employee(101, "Raj");
        Employee e2 = (Employee)e1.clone();
        
        System.out.println("e1 object: " + e1);
        System.out.println("e2 object: " + e2);
        
        System.out.println("----------e2 object changed----------");
        e2.setId(102);
        e2.setName("Raghav");
        
        System.out.println("e1 object: " + e1);
        System.out.println("e2 object: " + e2);
    }
}
