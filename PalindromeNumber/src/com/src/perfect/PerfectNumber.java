/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.perfect;

/**
 *
 * @author Manojit Nandi
 */
public class PerfectNumber {
    
    public static boolean isPerfect(int n) {
        int sum = 0;
        for(int i=1; i<=n/2; i++) {
            if(n%i == 0) {
                sum += i;
            }
        }
        
        return n==sum ? true : false;
    }
    
    public static void main(String[] args) {
        int temp = 61;
        if(isPerfect(temp)) {
            System.out.println(temp + " is a perfect number");
        } else {
            System.out.println(temp + " is not a perfect number");
        }
    }
}
