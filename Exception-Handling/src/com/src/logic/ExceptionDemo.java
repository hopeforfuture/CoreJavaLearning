/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.logic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Manojit Nandi
 */
public class ExceptionDemo {
    public static void main(String[] args) throws Exception {
        BufferedReader br = null;
        int i,j,k;
        
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter first number: ");
            i = Integer.parseInt(br.readLine());
            System.out.println("");
            System.out.print("Enter second number: ");
            j = Integer.parseInt(br.readLine());
            k = i/j;
            System.out.println("Result is: " + k);
        }catch(Exception ex) {
            System.out.println("Exception occured: " + ex);
        }
        finally {
            br.close();
        }
    }
}
