/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Manojit Nandi
 */
public class MaxMinWithStream {
    public static void main(String[] args) {
        //Given a list
        List<Integer> numbers = Arrays.asList(9,0,-1,12,17,21,3,4,401,-503,45,495);
        
        //Convert list into stream
        Stream<Integer>numStreams = numbers.stream();
        int max = numStreams.mapToInt(i -> i)
                .max()
                .getAsInt();
        
        Stream<Integer>numStreams2 = numbers.stream();
        
        int min = numStreams2.mapToInt(i -> i)
                .min()
                .getAsInt();
        
        System.out.println("Max: " + max + " Min: " + min);
        
    }
}
