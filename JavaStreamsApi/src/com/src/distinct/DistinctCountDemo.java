/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.distinct;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Manojit Nandi
 */
public class DistinctCountDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,1,1,2,2,2,2,3,3,4,5,6,7,7,7,8);
        int distinctCount = (int)nums.stream().distinct().count();
        System.out.println("Unique elements count: " + distinctCount);
    }
}
