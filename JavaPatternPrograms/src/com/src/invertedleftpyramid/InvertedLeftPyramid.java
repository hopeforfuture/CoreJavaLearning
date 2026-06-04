/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.invertedleftpyramid;
import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class InvertedLeftPyramid {
    public static void main(String[] args) {
        int rows = 0;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter any number: ");
            rows = sc.nextInt();
            if(rows <= 0) {
               System.out.println("Invalid value entered.");
               System.exit(0);
            }
            for(int i=0; i<rows; i++) {
                for(int j=0; j<2*i; j++) {
                    System.out.print(" ");
                }
                
                for(int k=0; k<2*(rows-i)-1; k++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        } catch(Exception ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }
}
