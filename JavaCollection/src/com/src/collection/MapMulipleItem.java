package com.src.collection;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Manojit Nandi
 */
public class MapMulipleItem {
    public static void main(String[] args) {
        Map<String, List<String>> fruits = new HashMap<>();
        
        fruits.put("fruits", new ArrayList<>());
        
        fruits.get("fruits").add("Apple");
        fruits.get("fruits").add("Banana");
        fruits.get("fruits").add("Lemon");
        fruits.get("fruits").add("Lime");
        fruits.get("fruits").add("Watermelon");
        
        for(Map.Entry<String, List<String>> entry : fruits.entrySet()) {
            String key = entry.getKey();
            
            System.out.println("Key: " + key);
            
            for(String value : entry.getValue()) {
                System.out.println(value);
            }
        }
    }
}
