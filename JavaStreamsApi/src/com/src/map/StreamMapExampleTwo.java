/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.map;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Manojit Nandi
 */
public class StreamMapExampleTwo {
    public static void main(String[] args) {
        List<String> numStrs = Arrays.asList("1", "2", "3", "4", "5");
        
        List<Integer> nums = numStrs.stream()
                            .map(element -> Integer.valueOf(element))
                            .toList();
        
        System.out.println("----List of numbers----");
        
        for(int i : nums) {
            System.out.println(i);
        }
    }
}
