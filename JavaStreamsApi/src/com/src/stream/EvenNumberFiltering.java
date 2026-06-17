/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.stream;
import java.util.stream.IntStream;

/**
 *
 * @author Manojit Nandi
 */
public class EvenNumberFiltering {
    public static void main(String[] args) {
        IntStream.range(1, 21)
                .filter(n -> n%2 == 0)
                .forEach(i -> System.out.println(i));
    }
}
