/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
class Student {
    private String name;
    private int rollno;
    
    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", rollno=" + rollno + '}';
    }
    
    
}
public class ToStringDemo {
    public static void main(String[] args) {
        Student s = new Student("Manojit", 101);
        
        System.out.println(s);
    }
}
