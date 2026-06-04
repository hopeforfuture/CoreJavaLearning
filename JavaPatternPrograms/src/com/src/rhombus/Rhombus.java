/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.rhombus;
import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class Rhombus {
    public static void main(String[] args) {
        try {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter row number: ");
            n = sc.nextInt();
            if(n<=0) {
                System.out.println("Invalid input entered.");
                System.exit(0);
            } 
            
            for(int i=0; i<n; i++) {
                for(int k=0; k<n-i-1; k++) {
                    System.out.print(" ");
                }
                for(int j=0; j<n; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
        } catch(Exception ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }
}
