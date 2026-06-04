/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.hourglass;
import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class HourGlass {
    public static void main(String[] args) {
        int rows = 0;
        
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number of rows: ");
            rows = sc.nextInt();
            if(rows < 0) {
                System.out.println("Invalid input entered.");
                System.exit(0);
            }
            for(int i=0; i<2*rows-1; i++) {
                int comp = 0;
                if(i < rows) {
                    comp = 2*i + 1;
                } else {
                    comp = 2*(2*rows - i) - 3;
                }
                
                for(int j=0; j<comp; j++) {
                    System.out.print(" ");
                }
                
                for(int k=0; k<2*rows - comp; k++) {
                    System.out.print("* ");
                }
                System.out.println("");
            }
            
        } catch(Exception ex) {
            System.out.println("Exception occured: " + ex.getMessage()); 
        }
    }
}
