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
    int i = 4;
    public void show() {
        System.out.println("In A show " + i);
    }
}
class B extends A {
    int i = 5;
    @Override
    public void show() {
        super.show();
        System.out.println("In B show. Original i: " + i + " Parent i: " + super.i);
    }
}
public class SuperDemo {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
