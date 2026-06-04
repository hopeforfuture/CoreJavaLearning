/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.misc;

/**
 *
 * @author Manojit Nandi
 */
public class NumberExceed {
    public static void printNumber(int rows) {
        int i,j,k;
        
        for(i = 1; i <= rows; i++) {
            for(j = 1; j <= rows; j++) {
                k = i + j - 1;
                
                if(k > rows) {
                    System.out.print(k-rows + " ");
                } else {
                    System.out.print(k + " ");
                }
            }
            
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        printNumber(10);
    }
}
