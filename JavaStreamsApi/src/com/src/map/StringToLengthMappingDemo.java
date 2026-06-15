/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.map;
import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.Map;

/**
 *
 * @author Manojit Nandi
 */
public class StringToLengthMappingDemo {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Lemon", "Watermelon");
        
        List<Integer> fruitsLength = fruits.stream().map(String::length).collect(Collectors.toList());
        System.out.println(fruitsLength);
        
        Map<String, Integer> mapKey = IntStream.range(0, fruitsLength.size())
                .boxed().collect(Collectors.toMap(
                        i -> fruits.get(i), 
                        i -> fruitsLength.get(i)));
        
        for(Map.Entry<String, Integer> entry : mapKey.entrySet()) {
            System.out.println(entry.getKey() + " --------> " + entry.getValue());
        }
        
        System.out.println("-------Printing elements using var---------");
        for(var e : mapKey.entrySet()) {
            System.out.println(e.getKey() + " --------> " + e.getValue());
        }
    }
}
