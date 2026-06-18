/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class UniqueCharsDemo {
    public static void main(String[] args) {
        Set<String> seen = new LinkedHashSet<>();
        String str = "programming";
        String uniqueStr = str.chars()
                            .mapToObj(c -> String.valueOf((char)c))
                            .filter(seen::add)
                            .collect(Collectors.joining());
                            
        System.out.println("String after removing duplicate chars: " + uniqueStr);
    }
}
