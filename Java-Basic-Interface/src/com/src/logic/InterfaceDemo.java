/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
interface abc {
    final public int i = 101;
    void show();
}
interface pqr extends abc {
    void display();
}
class Employee implements abc, pqr {
    @Override
    public void show() {
        System.out.println("In show method");
    }
    @Override
    public void display() {
        System.out.println("In display method");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.show();
        e1.display();
        System.out.println("Param i: " + e1.i);
    }
}
