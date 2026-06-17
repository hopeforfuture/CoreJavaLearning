/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.reduce;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Manojit Nandi
 */
public class ConcatenateWithSpace {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Stream", "API");
        
        String sentence = words.stream()
                               .reduce("", (a,b) -> a + " " + b);
        
        System.out.println("Final sentence: " + sentence);
    }
}
