/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interview.programs;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Manojit Nandi
 */
public class AverageFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50,55);
        double avg = numbers.stream()
                            .mapToInt(i -> i)
                            .average()
                            .getAsDouble();
        
        System.out.println("Avarage is : " + avg);
    }
}
