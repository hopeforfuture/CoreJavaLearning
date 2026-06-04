/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
interface A {
    
}
class Test implements A {
    public void show() {
        System.out.println("In show method in class A");
    }
}
public class MarkerDemo {
    public static void main(String[] args) {
        Test obj = new Test();
        if(obj instanceof A) {
            obj.show();
        } else {
            System.out.println("No marker interface");
        }
    }
}
