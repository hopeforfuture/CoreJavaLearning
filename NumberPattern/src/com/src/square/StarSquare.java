/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.square;

/**
 *
 * @author Manojit Nandi
 */
public class StarSquare {
    
    public static void printSquare(int rows) {
        int i,j,k;
        for(i = 1; i <= rows; i++) {
            for(j = 1; j <= rows; j++) {
                if(i == 1 || i == rows || j == 1 || j == rows) {
                    if((j == rows) && (i !=1 ) && (i != rows)) {
                        for(k = 0; k <= rows-4; k++) {
                            System.out.print(" ");
                        }
                    }
                    System.out.print("*");
                    if(j != rows) {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                    if(j == rows - 1) {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        printSquare(10);
    }
}
