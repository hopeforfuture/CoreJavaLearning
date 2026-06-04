/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.palindrome;

/**
 *
 * @author Manojit Nandi
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int n = 121121,r,s=0;
        int temp = n;
        
        while(n > 0) {
            r = n%10;
            n = n/10;
            s = s*10 + r; 
        }
        
        if(temp == s) {
            System.out.println(temp + " is a palindrome number");
        } else {
            System.out.println(temp + " is not a palindrome number");
        }
    }
}
