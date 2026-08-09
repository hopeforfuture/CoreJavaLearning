/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author Manojit Nandi
 */
public class CreateStreamExample {
    public static void main(String[] args) {
        
        //Create a stream from List
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Apple");
        fruitList.add("Lemon");
        fruitList.add("Watermelon");
        fruitList.add("Cucumber");
        fruitList.add("Lichi");
        fruitList.add("Guava");
        
        System.out.println("------Stream from List-------");
        Stream<String> stream = fruitList.stream();
        stream.forEach(element -> System.out.println(element));
        
        System.out.println("------Stream from Set-------");
        Set<String> fruitSet = new HashSet<>(fruitList);
        Stream<String> stream1 = fruitSet.stream();
        stream1.forEach(System.out::println);
        
        System.out.println("------Stream from Map-------");
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("Watermelon", 11);
        fruitMap.put("Cucumber", 25);
        fruitMap.put("Lemon", 20);
        fruitMap.put("Cherry", 8);
        fruitMap.put("Apple", 10);
        fruitMap.put("Banana", 15);
        
        Stream<Map.Entry<String, Integer>> stream2 = fruitMap.entrySet().stream();
        stream2.forEach(System.out::println);
        
        System.out.println("------Stream from Map's keyset-------");
        Stream<String> mapKeyStream = fruitMap.keySet().stream();
        mapKeyStream.forEach(System.out::println);
        
        System.out.println("------Stream from Map's values-------");
        Stream<Integer> mapValueStream = fruitMap.values().stream();
        mapValueStream.forEach(System.out::println);
        
        System.out.println("------Stream from Array's values-------");
        String[] fruitsArr = {"Apple", "Banana", "Guava", "Watermelon", "Cherry"};
        Stream<String> arrStream = Arrays.stream(fruitsArr);
        arrStream.forEach(System.out::println);
        
        System.out.println("------Exploring Stream.of method-------");
        Stream<String> fruitsStream = Stream.of("Apple", "Banana", "Cherry", "Lemon", "Watermelon");
        fruitsStream.forEach(System.out::println);
    }
}
