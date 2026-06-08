/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
public class OuterStaticClass {
    private static int x = 100;
    
    static class Inner {
        public void show() {
            System.out.println("Variable x in outer class: " + x);
        }
    }
}
