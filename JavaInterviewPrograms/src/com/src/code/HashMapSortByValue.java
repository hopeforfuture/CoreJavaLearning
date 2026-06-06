/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author Manojit Nandi
 */
public class HashMapSortByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        
        map.put("Manojit", 38);
        map.put("Palak", 33);
        map.put("Kaushik", 48);
        map.put("Naman", 27);
        map.put("Shyam", 42);
        map.put("Raghav", 44);
        
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
