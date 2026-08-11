/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Manojit Nandi
 */
public class DuplicateRemoval {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(6,1,2,2,1,3,4,4,5,6,7);
        List<Integer> uniqueNumbers = numbers.stream()
                                            .distinct()
                                            .sorted()
                                            .toList();
        
        for(int i : uniqueNumbers) {
            System.out.println(i);
        }
    }
 
}
