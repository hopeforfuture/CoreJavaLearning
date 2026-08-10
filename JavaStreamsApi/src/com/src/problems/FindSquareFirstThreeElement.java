/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Manojit Nandi
 */
public class FindSquareFirstThreeElement {
    public static void main(String[] args) {
        List<Integer> numInts = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> squrInts = numInts.stream()
                                        .filter(n -> n%2 == 0)
                                        .limit(3)
                                        .map(n -> n*n)
                                        .toList();
        
        for(int n : squrInts) {
            System.out.println(n);
        }
    }
}
