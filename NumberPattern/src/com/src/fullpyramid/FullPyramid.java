/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.fullpyramid;

/**
 *
 * @author Manojit Nandi
 */
public class FullPyramid {
    
    public static void printFullPyramidPattern(int rows) {
        int i,j,k,l;
        
        for(i = 0; i < rows; i++) {
            for(j = 0; j < 2 * (rows - i) - 1; j++) {
                System.out.print(" ");
            }
            
            for(k = 0; k < 2*i+1; k++) {
                l = k + 1;
                System.out.print(l + " ");
            }
            
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        printFullPyramidPattern(5);
    }
}
