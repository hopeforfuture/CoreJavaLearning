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
public class LongestStringDemo {
    public static void main(String[] args) {
        String longestString = Arrays.asList("Java", "Stream", "API")
                .stream()
                .reduce((a,b) -> a.length() > b.length() ? a : b)
                .get();
        
        System.out.println("Longest string is: " + longestString);
    }
}
