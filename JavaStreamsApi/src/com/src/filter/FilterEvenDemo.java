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
public class FilterEvenDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenNums = nums.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
        System.out.println("Even nums: " + evenNums);
    }
}
