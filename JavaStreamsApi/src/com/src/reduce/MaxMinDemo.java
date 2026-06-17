/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.reduce;
import java.util.Arrays;
import java.util.Optional;

/**
 *
 * @author Manojit Nandi
 */
public class MaxMinDemo {
    public static void main(String[] args) {
        Optional<Integer> maxDemo = Arrays.asList(1,2,3,4,-4,5,101,21,908,-234)
                .stream()
                .reduce(Integer::max);
        
        Optional<Integer> minDemo = Arrays.asList(-101,201,345,-55,-79,0,1,-890)
                .stream()
                .reduce(Integer::min);
        
        System.out.println("Max value: " + maxDemo.get());
        System.out.println("Min value: " + minDemo.get());
    }
}
