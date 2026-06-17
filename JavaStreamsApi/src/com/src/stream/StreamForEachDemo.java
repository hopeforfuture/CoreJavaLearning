/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.stream;
import java.util.List;
import java.util.Arrays;

/**
 *
 * @author Manojit Nandi
 */
public class StreamForEachDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Andrew", "Bill", "Caddik", "Embape", "Ronaldo", "Messi");
        names.stream()
             .forEach(System.out::println);
    }
}
