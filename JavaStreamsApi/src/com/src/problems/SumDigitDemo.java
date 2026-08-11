/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import java.util.stream.IntStream;

/**
 *
 * @author Manojit Nandi
 */
public class SumDigitDemo {
    public static void main(String[] args) {
        int number = 12345;
        
        IntStream stream = String.valueOf(number).chars();
        int sum = stream.map(ch -> Character.getNumericValue(ch)).sum();
        System.out.println("Sum is: " + sum);
    }
}
