/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.oddevenpattern;

/**
 *
 * @author Manojit Nandi
 */
public class ZeroOnePattern {
    
    public static void printNumber(int rows) {
        int i,j;
        
        for(i = 1; i <= rows; i++) {
            for(j = 1; j <= i; j++) {
                if((i + j)%2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                System.out.print(" ");
            }
            
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        printNumber(6);
    }
}
