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
public class ThrowDemo {
    public static void main(String[] args) {
        int i,j,k;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first integer: ");
            i = sc.nextInt();
            System.out.print("Enter second integer: ");
            j = sc.nextInt();
            k = i + j;
            if(k < 10) {
                throw new ArithmeticException();
            } else {
                System.out.println("The value of k: " + k);
            }
        } 
        catch(ArithmeticException ex) {
            System.out.println("The output for the operation should be atleast 10");
        }
        catch(Exception ex) {
            
        } 
    }
}
