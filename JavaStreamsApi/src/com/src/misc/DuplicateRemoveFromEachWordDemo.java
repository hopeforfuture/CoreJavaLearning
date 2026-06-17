/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.misc;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class DuplicateRemoveFromEachWordDemo {
    
    public static String RemoveDuplicateFromEachWord(String str) {
        return str.chars()
                .distinct()
                .mapToObj(ch -> String.valueOf((char)ch))
                .collect(Collectors.joining());
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any string: ");
            String sentence = sc.nextLine();
            String output = Arrays.stream(sentence.split(" "))
                                  .map(DuplicateRemoveFromEachWordDemo::RemoveDuplicateFromEachWord)
                                  .collect(Collectors.joining(" "));
            System.out.println("Output: " + output);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
