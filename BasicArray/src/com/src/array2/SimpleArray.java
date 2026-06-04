/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.src.array2;

/**
 *
 * @author Manojit Nandi
 */
public class SimpleArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        for(int i=0; i<a.length; i++) {
            a[i] = i+1;
        }
        
        for(int j : a) {
            System.out.print(j + " ");
        }
        System.out.println("");
    }
}
