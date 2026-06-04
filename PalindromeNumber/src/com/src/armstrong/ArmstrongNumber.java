/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.armstrong;


/**
 *
 * @author Manojit Nandi
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 370,r,temp,s = 0;
        temp = n;
        
        while(n>0) {
            r = n%10;
            n = n/10;
            s = s + (r*r*r);
        }
        
        if(n==s) {
            System.out.println(temp + " is an armstrong number");
        } else {
            System.out.println(temp + " is not an armstrong number");
        }
    }
}
