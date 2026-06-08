/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
class B {
    public void show() {
        System.out.println("Hi");
    }
}


public class AnonymousClassDemo {
    public static void main(String[] args) {
        B b = new B()
        {
            @Override
            public void show() {
                System.out.println("show method in anonymous class");
            }
        };
        b.show();
    }
}
