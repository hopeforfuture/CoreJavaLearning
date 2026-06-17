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
public class SumTotalDemo {
    public static void main(String[] args) {
        int sum = Arrays.asList(1,2,3,4,5,6,7,8,9,10)
                        .stream()
                        .reduce(0, (a,b) -> a+b);
        
        System.out.println("Sum is: " + sum);
    }
}
