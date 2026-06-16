/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.sort;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class SortingStringsByLength {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Python", "Java", "C", "SQL", "Kotlin");
        List<String> sortedLang = languages.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        for(String s : sortedLang) {
            System.out.println(s);
        }
    }
}
