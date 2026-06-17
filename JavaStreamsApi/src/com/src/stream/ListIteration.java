/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.stream;
import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author Manojit Nandi
 */
public class ListIteration {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Lemon",
        "Lichi", "Watermelon", "Cucumber");
        
        IntStream.range(0, fruits.size())
                .forEach(i -> System.out.println(fruits.get(i)));
        
    }
}
