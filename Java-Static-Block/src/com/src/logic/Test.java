/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

/**
 *
 * @author Manojit Nandi
 */
public class Test {
    static String s = "";
    
    static {
        s = "Initialized in static block";
    }
    
    public static void main(String[] args) {
        System.out.println("The value of s: " + s);
    }
}
