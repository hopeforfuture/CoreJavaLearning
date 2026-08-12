/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Manojit Nandi
 */
public class SortedStrings {
    public static void main(String[] args) {
        List<String> strArrs = Arrays.asList("Watermelon", "Grapes", "Apple", "Lemon", "Banana");
        List<String> sortedStrArr = strArrs.stream()
                                        .sorted(Comparator.reverseOrder())
                                        .toList();
        
        for(String s : sortedStrArr) {
            System.out.println(s);
        }
    }
}
