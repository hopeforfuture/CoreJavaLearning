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
public class DistinctSorted {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,-1,7,5,4,5,19,-19,7);
        List<Integer> uniqueNums = nums.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println("----Showing Original List-----");
        showList(nums);
        System.out.println("----Showing unique sorted List-----");
        showList(uniqueNums);
    }
    
    public static void showList(List<Integer> nums) {
        for(int i : nums) {
            System.out.println(i);
        }
    }
}
