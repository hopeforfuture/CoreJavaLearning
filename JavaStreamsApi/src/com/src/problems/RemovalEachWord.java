/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class RemovalEachWord {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any string: ");
            String str = sc.nextLine();
            String[] strArr = str.split(" ");
            Stream<String> stream = Stream.of(strArr);
            
            String reverse = stream.map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
            
            System.out.println("Reversed string: " + reverse);
        }
    }
}
