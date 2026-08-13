/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.interview.programs;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.List;

/**
 *
 * @author Manojit Nandi
 */
public class EvenNumberDemo {
    public static void main(String[] args) {
        int[] numbers = {10,15,20,25,30,35,40,45,50};
        IntStream stream = Arrays.stream(numbers);
        
        int[] evenNumbers = stream.filter(n -> n%2 == 0).toArray();
        System.out.println("-------List of Even Numbers-------");
        for(int n : evenNumbers) {
            System.out.println(n);
        }
    }
}
