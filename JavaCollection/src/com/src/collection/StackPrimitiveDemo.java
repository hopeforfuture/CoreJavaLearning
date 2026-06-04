/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.LinkedList;

/**
 *
 * @author Manojit Nandi
 */
public class StackPrimitiveDemo {
    public static void main(String[] args) {
        LinkedList<String> lang = new LinkedList<>();
        
        lang.push("Java");
        lang.push("Python");
        lang.push("C#");
        lang.push("TypeScript");
        lang.push("JavaScript");
        lang.push("C++");
        
        while(!lang.isEmpty()) {
            String n = lang.pop();
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}
