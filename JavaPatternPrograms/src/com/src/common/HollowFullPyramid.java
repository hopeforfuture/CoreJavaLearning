/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.common;
import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class HollowFullPyramid {
    public static void main(String[] args) {
        int rows = 0;
        try {
            System.out.print("Enter row number: ");
            Scanner sc = new Scanner(System.in);
            rows = sc.nextInt();
            if(rows <= 0) {
                System.out.println("Invalid number entered.");
                System.exit(0);
            }
            for(int i=0; i<rows; i++) {
                
                for(int j=0; j<2*(rows-i)-1; j++) {
                    System.out.print(" "); 
                }
                
                for(int k=0; k<2*i+1; k++) {
                    if(k==0 || k==2*i || i==rows-1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println("");
            }
            
            
            
        } catch(Exception ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }
}
