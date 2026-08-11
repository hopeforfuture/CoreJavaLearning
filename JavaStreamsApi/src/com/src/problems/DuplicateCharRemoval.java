/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.problems;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author Manojit Nandi
 */
public class DuplicateCharRemoval {
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter any string: ");
            String str = sc.nextLine();
           String str_updated =  str.chars()
               .distinct()
               .mapToObj(ch -> String.valueOf((char)ch))
                    .collect(Collectors.joining());
           
            System.out.println(str + " becomes " + str_updated + " after duplicate removal");
        }
    }
}
