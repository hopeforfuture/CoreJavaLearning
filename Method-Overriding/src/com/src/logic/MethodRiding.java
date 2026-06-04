/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */

class A {
    
    public void show() {
        System.out.println("In A class show method");
    }
}

class B extends A {
    
    public void show() {
        System.out.println("In B class show method");
    }
    
    public void showB() {
        System.out.println("In  showB method");
    }
}


public class MethodRiding {
    public static void main(String[] args) {
        B obj = new B();
        A obj1 = new B();
        obj.show();
        obj1.show();
    }
}
