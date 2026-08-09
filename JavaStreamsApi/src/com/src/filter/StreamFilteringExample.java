/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.filter;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author Manojit Nandi
 */
public class StreamFilteringExample {
    
    public static void printList(List<Integer> lst) {
        for(int i : lst) {
            System.out.println(i);
        }
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> streams = numbers.stream();
        List<Integer> evenNumbers = new ArrayList<>();
        evenNumbers = streams.filter(n -> n%2 == 0).toList();
        
        System.out.println("------List of all numbers-------");
        printList(numbers);
        
        System.out.println("------List of even numbers-------");
        printList(evenNumbers);
    }
}
