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
public class SumLengthString {
    public static void main(String[] args) {
       int len = Arrays.asList("Java", "Python", "C++", "Rust")
               .stream()
               .reduce(0, (sum, str) -> sum + str.length(), Integer::sum);
       
        System.out.println("Total length: " + len);
    }
}
