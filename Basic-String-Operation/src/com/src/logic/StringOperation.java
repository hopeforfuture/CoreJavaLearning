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
public class StringOperation {
    public static void main(String[] args) {
        String s1, s2, s3;
        int l1,l2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string: ");
        s1 = sc.nextLine();
        System.out.println("Enter second string: ");
        s2 = sc.nextLine();
        
        l1 = s1.length();
        l2 = s2.length();
        
        System.out.printf("The length of %s is %d", s1, l1);
        System.out.println("");
        System.out.printf("The length of %s is %d", s2, l2);
        System.out.println("");
        
        s3 = s1 + " " + s2;
        System.out.println("The result of concatenation: " + s3);
        
        System.out.printf("The uppercase edition of %s is %s", s1, s1.toUpperCase());
        System.out.println("");
        
    }
}
