/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.diamond;

import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class DiamondPatternDemo {
    public static void main(String[] args) {
        try {
            System.out.print("Enter any number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int comp = 0;
            
            if(n<=0) {
                System.out.println("Invaid input entered"); 
            } else {
                for(int i=0; i<2*n-1; i++) {
                    if(i < n) {
                        comp = 2*(n-i) - 1;
                    } else {
                        comp = 2*(i-n+1) + 1;
                    }
                    
                    for(int j=0; j<comp; j++) {
                        System.out.print(" ");
                    }
                    
                    for(int k=0; k<2*n-comp; k++) {
                        System.out.print("* ");
                    }
                    
                    System.out.println("");
                    
                }
            }
            
            
        } catch(Exception ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }
}
