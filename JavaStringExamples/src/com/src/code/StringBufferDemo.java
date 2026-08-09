/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;

/**
 *
 * @author Manojit Nandi
 */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Navin");
        sb.append(" Reddy");
        sb.insert(6, "Java ");
        System.out.println("Updated String: " + sb.toString());
    }
}
