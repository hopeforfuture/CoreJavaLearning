/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.streams.lesson;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

/**
 *
 * @author Manojit Nandi
 */
public class CreateStream {
    public static void main(String[] args) {
        System.out.println("-----Stream from List-------");
        List<String> fruitLists = Arrays.asList("Apple", "Banana", "Lemon", "Watermelon", "Cucumber");
        fruitLists.stream()
                .forEach(System.out::println);
        
        System.out.println("-----Stream from HashSet-------");
        
        Set<String> hashSet = new HashSet<>(fruitLists);
        hashSet.stream()
                .forEach(System.out::println);
        
        System.out.println("-----Stream from HashMap-------");
        Map<String, Integer> fruitsMap = new HashMap<>();
        fruitsMap.put("Apple", 10);
        fruitsMap.put("Banana", 20);
        fruitsMap.put("Lemon", 15);
        fruitsMap.put("Watermelon", 30);
        Stream<Map.Entry<String, Integer>> mapEntryStream = fruitsMap.entrySet().stream();
        mapEntryStream.forEach(c -> System.out.println(c.getKey() + " -> " + c.getValue()));
        
        System.out.println("-----Stream from Array-------");
        String[] strArray = {"Apple", "Banana", "Lemon", "Cherry"};
        Stream<String> strStreams = Arrays.stream(strArray);
        strStreams.forEach(System.out::println);
    }
}
