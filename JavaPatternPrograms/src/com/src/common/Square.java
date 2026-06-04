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
public class Square {
    public static void main(String[] args) {
        int rows = 0;
        try {
          System.out.print("Enter row number: ");
          Scanner sc = new Scanner(System.in);
          rows = sc.nextInt();
          
          if(rows <= 0) {
              System.out.println("Invalid row number entered.");
              System.exit(0);
          }
          
          for(int i=0; i<rows; i++) {
              for(int j=0; j<rows; j++) {
                  if(i > 0 && i < rows-1 && j > 0 && j < rows-1) {
                      System.out.print("  ");
                  } else {
                      System.out.print("* ");
                  }
                  
              }
              System.out.println("");
          }
          
        } catch(Exception ex) {
            System.out.println("Exception occured: " + ex.getMessage());
        }
    }
}
