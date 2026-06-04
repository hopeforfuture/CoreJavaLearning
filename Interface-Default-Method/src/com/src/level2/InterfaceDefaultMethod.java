/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.level2;

/**
 *
 * @author Manojit Nandi
 */
interface A {
    default void show() {
        System.out.println("In interface A");
    }
    
    static void demo() {
        System.out.println("Interface is allowing static method also");
    }
}
class B {
    public void show() {
        System.out.println("In class B");
    }
}
class C extends B implements A {
    public void anotherMethod() {
        System.out.println("In class C");
    }
}
public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.anotherMethod();
        A.demo();
    }
}
