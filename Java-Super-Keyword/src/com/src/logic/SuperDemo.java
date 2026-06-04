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
    public A() {
        System.out.println("In const A");
    }
    public A(int i) {
        System.out.println("In const A with param " + i);
    }
}
class B extends A{
    public B() {
        System.out.println("In const B");
    }
    public B(int i) {
        super(i);
        System.out.println("In const B with param " + i);
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        B obj = new B(10);
    }
}
