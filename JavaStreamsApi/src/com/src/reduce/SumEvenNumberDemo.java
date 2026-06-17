/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.reduce;

import java.util.Arrays;

/**
 *
 * @author Manojit Nandi
 */
public class SumEvenNumberDemo {
    public static void main(String[] args) {
        int sum = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12)
                .stream()
                .filter(n -> n%2 == 0)
                .reduce(0, Integer::sum);
        
        System.out.println("Sum total of all even number: " + sum);
    }
}
