/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;

/**
 *
 * @author Manojit Nandi
 */
interface A {
    
    default void show() {
        System.out.println("show method in interface A");
    }
}

interface B {
    default void show() {
        System.out.println("show method in interface B");
    }
}

class C implements A, B {
    @Override
    public void show() {
        A.super.show();
    }
}

public class InterfaceDefaultDemo {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
