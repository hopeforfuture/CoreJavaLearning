/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.sort;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;

/**
 *
 * @author Manojit Nandi
 */
public class SortedReverseDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> sortedNums = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        for(int i : sortedNums) {
            System.out.println(i);
        }
    }
}
