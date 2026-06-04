/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class Fibonacci {
    public static void main(String[] args) {
        long n,a,b,k=0, i=2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        try {
            n = sc.nextInt();
            a = 1;
            b = 1;
            
            if(n<0) {
                System.out.println("Invalid no entered.");
            }
            else {
                System.out.print("1 1 ");
                while(i < n) {
                    k = a + b;
                    a = b;
                    b = k;

                    System.out.print(k + " ");
                    i++;
                }
            }
            System.out.println("");
        }catch(Exception ex) {
            System.out.println("Exception thrown: " + ex.getCause());
        }
    }
}
