/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.code;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Manojit Nandi
 */
public class PrintListElement {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("-----Printing Double of every element/Method One--------");
        nums.forEach(PrintListElement::DoubleItDemo);
        
        System.out.println("-----Printing Double of every element/Method Two--------");
        nums.forEach(i -> System.out.println(getDoubleCount(i)));
    }
    
    public static void DoubleItDemo(int i) {
        System.out.println(i*2);
    }
    
    public static int getDoubleCount(int i) {
        return i*2;
    }
}
