/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.collection;
import java.util.TreeMap;

/**
 *
 * @author Manojit Nandi
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> fruits = new TreeMap<>();
        
        fruits.put(106, "Guava");
        fruits.put(101, "Apple");
        fruits.put(107, "Cherry");
        fruits.put(104, "Cucumber");
        fruits.put(105, "Lemon");
        fruits.put(102, "Banana");
        fruits.put(103, "Watermelon");
        
        for(Integer key : fruits.keySet()) {
            System.out.println(key + " " + fruits.get(key));
        }
        
        System.out.println("Headmap for key 104: " + fruits.headMap(104, true));
        System.out.println("Tailmap for key 104: " + fruits.tailMap(104, false));
        System.out.println("Submap for key 104 and 107: " + fruits.subMap(104, 107));
    }
}
