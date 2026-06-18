/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.sort;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Manojit Nandi
 */
public class SecondLargestElement {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,2,5,9,6,7,8);
        Integer secondLargest = nums.stream()
                                  .distinct()
                                  .sorted((a,b) -> b-a)
                                  .skip(1)
                                  .findFirst()
                                  .orElse(null);
        
        System.out.println(secondLargest);   
    }
}
