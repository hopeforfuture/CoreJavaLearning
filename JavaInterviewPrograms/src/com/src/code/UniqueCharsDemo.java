/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.util.Set;
import java.util.LinkedHashSet;

/**
 *
 * @author Manojit Nandi
 */
public class UniqueCharsDemo {
    public static void main(String[] args) {
        Set<Character> seen = new LinkedHashSet<>();
        String str = "programming";
        String uniqueStr = str.chars()
                            .filter(c -> seen.add((char)c))
                            .collect(StringBuilder::new, (sb,c) -> sb.append((char)c), StringBuilder::append)
                            .toString();
        System.out.println("String after removing duplicate chars: " + uniqueStr);
    }
}
