/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class SquareEachNumber {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        
        List<Integer> numsDouble = nums.stream().map(n -> n*n).collect(Collectors.toList());
        
        for(int n : numsDouble) {
            System.out.println(n);
        }
    }
}
