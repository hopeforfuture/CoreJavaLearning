/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.distinct;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class RemoveDuplicateIntegers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,3,3,4,5,6,1,7);
        
        List<Integer> uniqueNums = nums.stream().distinct().collect(Collectors.toList());
        System.out.println("--------Unique Elements------");
        for(int i : uniqueNums) {
            System.out.println(i);
        }
        
        List<String> fruits = Arrays.asList("Apple", "Banana", "Watermelon", "Apple", "Orange", "Banana");
        System.out.println("----Original List Contains------");
        for(String s : fruits) {
            System.out.print(s + " ");
        }
        System.out.println("");
        System.out.println("-----List after removing duplicate elements-------");
        List<String> uniqueFruits = fruits.stream().distinct().collect(Collectors.toList());
        for(String s : uniqueFruits) {
            System.out.print(s + " ");
        }
        System.out.println("");
    }
}
