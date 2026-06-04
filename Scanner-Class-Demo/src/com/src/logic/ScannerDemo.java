/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

import java.util.Scanner;

/**
 *
 * @author Manojit Nandi
 */
public class ScannerDemo {
    public static void main(String[] args) throws Exception {
        int range = 0;
        long a = 0, b = 1, c = 0;
        int i = 2, j = 0;
        System.out.print("Please enter range: ");
        Scanner sc = new Scanner(System.in);
        range = sc.nextInt();
        System.out.println("Fibonacci series for given range is given below:");
        System.out.println(" " + a);
        System.out.println(" " + b);
        while(i < range) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(" " + c);
            i++;
        }
        
        System.out.println("");
        
    }
}
