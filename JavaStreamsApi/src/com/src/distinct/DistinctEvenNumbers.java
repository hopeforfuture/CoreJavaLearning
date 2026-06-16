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
public class DistinctEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,3,4,5,6,7,7,8,9,10);
        
        List<Integer> uniqueEvenNums = nums.stream().filter(n -> n%2 == 0).distinct().collect(Collectors.toList());
        for(int i : uniqueEvenNums) {
            System.out.println(i);
        }
    }
}
