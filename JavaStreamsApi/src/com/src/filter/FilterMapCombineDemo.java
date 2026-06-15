/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class FilterMapCombineDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        
        List<Integer> evenNumsSquare = nums.stream().filter(n -> n%2 == 0).map(n -> n*n).collect(Collectors.toList());
        System.out.println("Square of even numbers: ");
        for(int i : evenNumsSquare) {
            System.out.println(i);
        }
    }
}
