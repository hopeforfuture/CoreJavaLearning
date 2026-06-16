/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.sort;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class SortingAfterRemovingDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(9,2,3,7,-5,1,1,3,3,9);
        System.out.println("----Original list-----");
        for(int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println("");
        List<Integer> uniqueNums = nums.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("----Modified list-----");
        for(int i : uniqueNums) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}
