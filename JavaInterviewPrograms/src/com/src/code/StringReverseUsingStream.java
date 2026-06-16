/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;
import java.util.stream.*;
import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class StringReverseUsingStream {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any string: ");
            String str = sc.nextLine();
            String reverseStr = IntStream.range(0, str.length()).mapToObj(i -> String.valueOf(str.charAt(str.length()-1-i))).collect(Collectors.joining());
            System.out.println("Reverse string: " + reverseStr); 
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
