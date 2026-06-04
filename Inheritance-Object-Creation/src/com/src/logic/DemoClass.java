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
        System.out.println("In A class Const");
    }
    public A(int i) {
        System.out.println("In A class Const Int");
    }
}

class B extends A {
    public B() {
        System.out.println("In B class Const");
    }
    public B(int i) {
        //super(i);
        System.out.println("In B class Const Int");
    }
}

public class DemoClass {
    public static void main(String[] args) {
        B obj = new B(101);
        A obj1 = new B(100);
    }
}
