/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.filter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class FilterName {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Bob", "Caddic", "Michael", "Alex");
        
        List<String> filterNames = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(filterNames);
    }
}
