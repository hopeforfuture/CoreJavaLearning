/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.map;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class ConvertToUpperCaseDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("manojit", "Pramod", "Navin", "Raghav", "Raj");
        
        //List<String> upperNames = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> upperNames = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        
        for(String name : upperNames) {
            System.out.println(name);
        }
    }
}
