/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.filter;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;

/**
 *
 * @author Manojit Nandi
 */
public class FilterStringsByLength {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Python", "Csharp", "PHP", "Go", "JavaScript", "Rust", "Kotlin", "C");
        List<String> filterLang = languages.stream().filter(s -> s.length() > 3).collect(Collectors.toList());
        System.out.println("Original languages: " + languages);
        System.out.println("Filtered languages: " + filterLang);
    }
}
