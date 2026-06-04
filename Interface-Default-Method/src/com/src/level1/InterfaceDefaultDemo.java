/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.level1;

/**
 *
 * @author Manojit Nandi
 */
interface Abc {
   default void show() {
       System.out.println("In Abc interface");
   }
}
class Test implements Abc {
    public void show() {
        System.out.println("Method is redefined in class");
    }
}
public class InterfaceDefaultDemo {
    public static void main(String[] args) {
        new Test().show();
    }
}
