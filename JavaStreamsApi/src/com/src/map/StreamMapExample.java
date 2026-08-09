/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.map;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Manojit Nandi
 */
public class StreamMapExample {
    public static void main(String[] args) {
        List<String> fruitsList = Arrays.asList("Apple", "Banana", "Mango", "Cherry", "Watermelon", "Lemon");
        Stream<String> streams = fruitsList.stream();
        
        List<String> mapFruitsList = streams
                .peek(element -> System.out.println("Before Map() method: " + element))
                .map(element -> element.toUpperCase())
                .peek(element -> System.out.println("After Map() method: " + element))
                .toList();
        System.out.println("------List of Fruits------");
        
        for(String s : mapFruitsList) {
            System.out.println(s + " ");
        }
    }
}
