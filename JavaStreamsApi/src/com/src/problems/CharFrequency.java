/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class CharFrequency {
    public static void main(String[] args) {
        String str = "my experiment with truth";
        
        Map<Character, Long> charFreqencyMap = str.toLowerCase()
                .chars()
                .mapToObj(i -> (char)i)
                .filter(c -> !Character.isWhitespace(c))
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));
        
        for(var e : charFreqencyMap.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
