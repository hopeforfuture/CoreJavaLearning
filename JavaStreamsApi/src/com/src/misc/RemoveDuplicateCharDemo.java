/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.misc;
import java.util.stream.Collectors;
import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class RemoveDuplicateCharDemo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any string: ");
            String str = sc.nextLine();
            
            String strUniqueChars = str.chars()
                    .distinct()
                    .mapToObj(ch -> String.valueOf((char)ch))
                    .collect(Collectors.joining());
            
            System.out.println("");
            System.out.println("Original string after removing duplicate chars: " + strUniqueChars);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
