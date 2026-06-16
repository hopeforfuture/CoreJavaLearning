/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.util.Arrays;
import java.util.stream.*;
import java.util.Scanner;
/**
 *
 * @author Manojit Nandi
 */
public class RemoveDuplicateCharsDemo {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any string: ");
            String str = sc.nextLine();
            String uniqueCharsStr = str.chars()
                    .mapToObj(ch -> String.valueOf((char)ch))
                    .distinct()
                    .collect(Collectors.joining());
            System.out.println("Unique string: " + uniqueCharsStr); 
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
