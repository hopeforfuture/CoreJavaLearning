/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.lefthalfpyramid;

/**
 *
 * @author Manojit Nandi
 */
public class LeftHalfPyramid {
    public static void printLeftHalfPyramid(int rows) {
        int i,j,k,l;
        
        for(i=0; i < rows; i++) {
            for(j = 0; j < 2 * (rows-i) - 1; j++) {
                System.out.print(" ");
            }
            for(k = 0; k <= i; k++) {
                l = k + 1;
                System.out.print(l + " ");
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        printLeftHalfPyramid(10);
    }
}
