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
    final public void show() {
        System.out.println("In A show method.");
    }
}
class B extends A {
    
}
public class FinalDemo {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
