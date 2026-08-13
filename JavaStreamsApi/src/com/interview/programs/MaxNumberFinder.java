/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interview.programs;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Manojit Nandi
 */
public class MaxNumberFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,55);
        int max = numbers.stream()
                .max(Integer::compareTo)
                .orElseThrow();
        
        System.out.println("Max number: " + max);
    }
}
