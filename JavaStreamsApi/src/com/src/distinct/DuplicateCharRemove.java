/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.distinct;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.*;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class DuplicateCharRemove {
    public static void main(String[] args) {
        String str = "Programming";
        System.out.println("Original string: " + str);
        System.out.println("Final string: " + removeCharsUsingSet(str));
        System.out.println("Final string: " + removeCharsUsingStream(str));
        System.out.println("Final string: " + removeCharsUsingStreamTwo(str));
    }
    
    public static String removeCharsUsingSet(String str) {
        LinkedHashSet<Character> chars = new LinkedHashSet<>();
        
        char[] chrarr = str.toCharArray();
        for(char ch : chrarr) {
            chars.add(ch);
        }
        StringBuilder sb = new StringBuilder();
        
        for(char ch : chars) {
            sb.append(ch);
        }
        return sb.toString();
    }
    
    public static String removeCharsUsingStream(String str) {
        List<Character> lstchars = str.chars()
                                    .mapToObj(ch -> (char)ch)
                                    .distinct()
                                    .collect(Collectors.toList());
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : lstchars) {
            sb.append(ch);
        }
        return sb.toString(); 
    }
    
    public static String removeCharsUsingStreamTwo(String str) {
        
        List<Character> lstchars = new ArrayList<>();
        
        for(char ch : str.toCharArray()) {
            lstchars.add(ch);
        }
        
        List<Character> uniqueChars = lstchars.stream().distinct().collect(Collectors.toList());
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : uniqueChars) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
