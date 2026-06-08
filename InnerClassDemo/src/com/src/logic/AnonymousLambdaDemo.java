/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Manojit Nandi
 */
public class AnonymousLambdaDemo {
    public static void main(String[] args) {
        Fruit f = () -> 
        {
            Map<Integer, String> m = new HashMap<>();
            m.put(101, "Apple");
            m.put(102, "Banana");
            m.put(103, "Watermelon");
            m.put(104, "Lemon");
            
            for(Map.Entry<Integer, String> entry : m.entrySet()) {
                System.out.println("Id: " + entry.getKey() + " Value: " + entry.getValue());
            }
        };
        
        f.showAllFruits();
    }
}

@FunctionalInterface
interface Fruit {
    void showAllFruits();
}
