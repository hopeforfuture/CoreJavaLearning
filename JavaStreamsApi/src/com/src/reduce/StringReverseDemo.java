/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.reduce;

import java.util.Arrays;

/**
 *
 * @author Manojit Nandi
 */
public class StringReverseDemo {
    public static void main(String[] args) {
        String str = "Hello";
        String reverseStr = Arrays.stream(str.split(""))
                .reduce("", (a,b) -> b + a);
        
        System.out.println("Original string: " + str);
        System.out.println("Reverse string: " + reverseStr);
    }
}
