/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.distinct;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class DistinctWordGet {
    public static void main(String[] args) {
        String sentence = "Java is powerful and Java is easy";
        List<String> uniqueStrs = Arrays.stream(sentence.split(" ")).distinct().collect(Collectors.toList());
        StringBuilder sb = new StringBuilder();
        for(String s : uniqueStrs) {
            sb.append(s).append(" ");
        }
        System.out.println("Final string: " + sb.toString().trim());
    }
}
