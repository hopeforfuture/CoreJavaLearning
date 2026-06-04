/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.threadbasics;

/**
 *
 * @author Manojit Nandi
 */
public class ThreadBasics {
    public static void main(String[] args) {
        A a = new A();
        a.start();
        
        B b = new B();
        b.start();
    }
}
