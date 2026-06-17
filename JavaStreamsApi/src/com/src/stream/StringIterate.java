/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.stream;
import java.util.stream.Stream;

/**
 *
 * @author Manojit Nandi
 */
public class StringIterate {
    public static void main(String[] args) {
        Stream.iterate(1, n -> n+1)
                .limit(10)
                .forEach(i -> System.out.println(i));
    }
}
