/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.limit;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;

/**
 *
 * @author Manojit Nandi
 */
public class LargestThreeNumbersDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(70,10,-90,80,55,65,15,-35,105,-105);
        List<Integer> largestThreeNumbers = nums.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("---Latest three numbers---");
        for(int i : largestThreeNumbers) {
            System.out.println(i);
        }
    }
}
