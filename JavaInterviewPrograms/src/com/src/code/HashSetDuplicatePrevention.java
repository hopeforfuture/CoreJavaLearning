/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author Manojit Nandi
 */
class Employee
{
    int id;
    
    public Employee(int id)
    {
       this.id = id; 
    }
    
    @Override
    public boolean equals(Object obj)
    {
        Employee e = (Employee)obj;
        return this.id == e.id;
    }
    
    @Override
    public int hashCode() 
    {
        return Objects.hashCode(id);
    }
}


public class HashSetDuplicatePrevention {
    public static void main(String[] args) {
        HashSet<Employee> set = new HashSet<>();
        set.add(new Employee(1));
        set.add(new Employee(1));
        
        System.out.println("Size of the set: " + set.size());
    }
}
