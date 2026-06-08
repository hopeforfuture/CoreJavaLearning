/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
public class Outer {
    private String message = "Hello from outer class";
    
    public class Inner {
        public void show() {
            System.out.println("Showing message inside inner class: " + message);
        }
    }
}
