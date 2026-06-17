/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.stream;

/**
 *
 * @author Manojit Nandi
 */
public class PrintStrChar {
    public static void main(String[] args) {
        String str = "JAVA is a beautiful language and stream too";
        str.chars()
           .forEach(ch -> System.out.println((char)ch));
    }
}
